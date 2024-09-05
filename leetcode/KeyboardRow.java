package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class KeyboardRow {
    public static final Set<Character> FIRST_ROW = Set.of('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p');
    public static final Set<Character> SECOND_ROW = Set.of('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l');
    public static final Set<Character> THIRD_ROW = Set.of('z', 'x', 'c', 'v', 'b', 'n', 'm');

    public static void main(String[] args) {
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        String[] result = findWords(words);
        System.out.println(Arrays.toString(result));
    }

    private static String[] findWords(String[] words) {
        List<String> result = new ArrayList<>();

        for (String w : words) {
            String word = w.toLowerCase();
            Set<Character> row = defineRow(word.charAt(0));
            if (row.isEmpty()) {
                return new String[0];
            }

            if (isAllInOneRow(word, row)) {
                result.add(w);
            }
        }

        return result.toArray(new String[0]);
    }

    private static boolean isAllInOneRow(String str, Set<Character> row) {
        for (char c : str.toCharArray()) {
            if (!row.contains(c)) {
                return false;
            }
        }

        return true;
    }

    private static Set<Character> defineRow(char charAt) {
        if (FIRST_ROW.contains(charAt)) {
            return FIRST_ROW;
        } else if (SECOND_ROW.contains(charAt)) {
            return SECOND_ROW;
        } else if (THIRD_ROW.contains(charAt)) {
            return THIRD_ROW;
        } else {
            return Collections.emptySet();
        }
    }
}
