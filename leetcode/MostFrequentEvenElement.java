package leetcode;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentEvenElement {
    public static void main(String[] args) {
        int[] nums = {2, 10000, 10000, 10000, 2};
        System.out.println(mostFrequentEven(nums));
    }

    private static int mostFrequentEven(int[] nums) {
        int mostFrequentElement = -1;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int value : nums) {
            if (value % 2 == 0) {
                map.computeIfPresent(value, (k, v) -> ++v);
                map.putIfAbsent(value, 1);
            }
        }

        if (map.isEmpty()) {
            return mostFrequentElement;
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > count) {
                mostFrequentElement = entry.getKey();
                count = entry.getValue();
            } else if (entry.getValue().equals(map.get(mostFrequentElement)) && entry.getKey() < mostFrequentElement) {
                mostFrequentElement = entry.getKey();
                count = entry.getValue();
            }
        }

        return mostFrequentElement;
    }
}
