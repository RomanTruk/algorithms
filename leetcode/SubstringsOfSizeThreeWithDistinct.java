package leetcode;

import java.util.HashSet;
import java.util.Set;

public class SubstringsOfSizeThreeWithDistinct {
    public int countGoodSubstrings(String s) {
        int count = 0;
        if (s.isEmpty()) {
            return 0;
        }
        if (s.length() < 3) {
            return 0;
        }

        for (int i = 0; i <= s.length() - 3; i++) {
            String substring = s.substring(i, i + 3);
            Set<Character> characterSet = new HashSet<>();

            for (int j = 0; j < substring.length(); j++) {
                characterSet.add(substring.charAt(j));
            }

            if (characterSet.size() == 3) {
                count++;
            }
        }

        return count;
    }
}
