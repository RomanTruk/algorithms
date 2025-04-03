package leetcode;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if (pattern.length() != words.length) {
            return false;
        }

        Map<String, Character> wordCharMap = new HashMap<>();
        Map<Character, String> charWordMap = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            String word = words[i];

            char currentChar = pattern.charAt(i);
            String wordByChar = charWordMap.get(currentChar);
            Character charByWord = wordCharMap.get(word);

            if (wordByChar != null && !wordByChar.equals(word)) {
                return false;
            } else {
                if (charByWord != null && !charByWord.equals(currentChar)) {
                    return false;
                }

                wordCharMap.put(word, currentChar);
                charWordMap.put(currentChar, word);
            }
        }

        return true;
    }
}
