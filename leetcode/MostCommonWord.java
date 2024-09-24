package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class MostCommonWord {
    public static void main(String[] args) {
        String paragraph = "Bob. hIt, baLl";
        String[] banned = {"bob", "hit"};
        String result = mostCommonWord(paragraph, banned);
        System.out.println(result);
    }

    private static String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String, Integer> wordCountMap = new HashMap<>();
        HashSet<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        String[] words = paragraph.toLowerCase().split("[\\p{Punct}\\s]+");

        String result = words[0];
        int maxCount = 0;
        for (String word : words) {
            int wordCount = wordCountMap.getOrDefault(word, 0) + 1;
            wordCountMap.put(word, wordCount);
            if (wordCount > maxCount && !bannedSet.contains(word)) {
                maxCount = wordCount;
                result = word;
            }
        }

        return result;
    }
}
