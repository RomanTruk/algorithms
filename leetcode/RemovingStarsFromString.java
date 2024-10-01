package leetcode;

import java.util.Stack;

public class RemovingStarsFromString {
    public static void main(String[] args) {
        String s = "leet**cod*e";
        System.out.println(removeStars(s));
    }

    private static String removeStars(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c != '*') {
                stack.push(c);
            } else if (!stack.empty()) {
                stack.pop();
            }
        }

        StringBuilder result = new StringBuilder();
        for (Character c : stack) {
            result.append(c);
        }

        return result.toString();
    }
}
