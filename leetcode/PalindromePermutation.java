package leetcode;

import java.util.HashMap;

public class PalindromePermutation {
    public boolean canPermutePalindrome(String s) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            charCountMap.put(ch, charCountMap.getOrDefault(ch,0) + 1);
        }

        int notPairChar = 0;

        for (Integer count : charCountMap.values()) {
            if (count % 2 != 0) {
                notPairChar++;
            }
        }

        return notPairChar <= 1;
    }
}
