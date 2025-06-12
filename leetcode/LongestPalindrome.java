package leetcode;

import java.util.HashSet;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        int length = 0;

        HashSet<Character> charSet = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (charSet.contains(c)) {
                charSet.remove(c);
                length += 2;
            } else {
                charSet.add(c);
            }
        }

        if (!charSet.isEmpty()) {
            length += 1;
        }

        return length;
    }
}
