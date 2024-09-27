package leetcode;

import java.util.Set;

public class MaxNumberVowelsInSubstringOfGivenLength {
    public static void main(String[] args) {
        String s = "aeiou";
        int k = 2;
        System.out.println(maxVowels(s, k));
    }

    private static int maxVowels(String s, int k) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        int count = 0;
        for (int i = 0; i < k; i++) {
            if (vowels.contains(s.charAt(i))) {
                count++;
            }
        }

        int maxCount = count;
        for (int i = k; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i))) {
                count++;
            }

            if (vowels.contains(s.charAt(i - k))) {
                count--;
            }

            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }
}
