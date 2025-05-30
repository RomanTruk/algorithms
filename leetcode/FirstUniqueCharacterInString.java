package leetcode;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInString {
    public int firstUniqChar(String s) {
        Map<Character, Integer> countMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (countMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}
