package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LetterCombinationsPhoneNumber {
    public static void main(String[] args) {
        String digits = "23";
        System.out.println(letterCombinations(digits));
    }

    private static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        if (digits.isEmpty()) {
            return result;
        }

        Map<Integer, List<Character>> numCharsMap = Map.of(
                2, List.of('a', 'b', 'c'),
                3, List.of('d', 'e', 'f'),
                4, List.of('g', 'h', 'i'),
                5, List.of('j', 'k', 'l'),
                6, List.of('m', 'n', 'o'),
                7, List.of('p', 'q', 'r', 's'),
                8, List.of('t', 'u', 'v'),
                9, List.of('w', 'x', 'y', 'z')
        );

        backtrack(result, new StringBuilder(), digits, 0, numCharsMap);

        return result;
    }

    private static void backtrack(List<String> result,
                                  StringBuilder current,
                                  String digits,
                                  int index,
                                  Map<Integer, List<Character>> numCharsMap) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        int digit = Character.getNumericValue(digits.charAt(index));
        List<Character> chars = numCharsMap.get(digit);

        for (char c : chars) {
            current.append(c);
            backtrack(result, current, digits, index + 1, numCharsMap);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
