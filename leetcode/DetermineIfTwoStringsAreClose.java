package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DetermineIfTwoStringsAreClose {
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "bca";
        System.out.println(closeStrings(word1, word2));
    }

    private static boolean closeStrings(String word1, String word2) {
        int[] counts1 = new int[26];
        int[] counts2 = new int[26];
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        for (char c : word1.toCharArray()) {
            counts1[c - 'a']++;
            set1.add(c);
        }
        for (char c : word2.toCharArray()) {
            counts2[c - 'a']++;
            set2.add(c);
        }

        Arrays.sort(counts1);
        Arrays.sort(counts2);

        return set1.equals(set2) && Arrays.equals(counts1, counts2);
    }
}
