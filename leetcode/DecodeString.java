package leetcode;

import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {
        String s = "3[a2[c]]";
        System.out.println(decodeString(s));
    }

    private static String decodeString(String s) {
        Stack<Integer> counts = new Stack<>();
        Stack<String> strings = new Stack<>();
        String result = "";
        int index = 0;

        while (index < s.length()) {
            if (Character.isDigit(s.charAt(index))) {
                int count = 0;
                while (Character.isDigit(s.charAt(index))) {
                    count = 10 * count + (s.charAt(index) - '0');
                    index += 1;
                }
                counts.push(count);
            } else if (s.charAt(index) == '[') {
                strings.push(result);
                result = "";
                index += 1;
            } else if (s.charAt(index) == ']') {
                StringBuilder builder = new StringBuilder(strings.pop());
                int count = counts.pop();
                for (int i = 0; i < count; i++) {
                    builder.append(result);
                }
                result = builder.toString();
                index += 1;
            } else {
                result += s.charAt(index);
                index += 1;
            }
        }

        return result;
    }
}
