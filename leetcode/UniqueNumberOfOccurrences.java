package leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumberOfOccurrences {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1, 1, 3};
        System.out.println(uniqueOccurrences(arr));
    }

    private static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> numCountMap = new HashMap<>();
        for (int num : arr) {
            numCountMap.put(num, numCountMap.getOrDefault(num, 0) + 1);
        }

        return numCountMap.keySet().size() == new HashSet<>(numCountMap.values()).size();
    }
}
