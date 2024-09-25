package leetcode;

import java.util.Set;
import java.util.Stack;

public class ReverseVowelsOfString {
    public static void main(String[] args) {
        String s = "IceCreAm";
        System.out.println(reverseVowels(s));
    }

    private static String reverseVowels(String s) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char charAt = s.charAt(i);
            if (vowels.contains(charAt)) {
                stack.push(charAt);
            }
        }

        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (vowels.contains(charArray[i])) {
                charArray[i] = stack.pop();
            }
        }

        return String.valueOf(charArray);
    }
}
