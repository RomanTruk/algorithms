package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numCountMap = new HashMap<>();
        for (int num : nums) {
            numCountMap.put(num, numCountMap.getOrDefault(num, 0) + 1);
        }

        Map<Integer, List<Integer>> freqNumListMap = new HashMap<>();
        for (Map.Entry<Integer, Integer> entry : numCountMap.entrySet()) {
            freqNumListMap.computeIfAbsent(entry.getValue(), key -> new ArrayList<>());
            freqNumListMap.get(entry.getValue()).add(entry.getKey());
        }

        int[] result = new int[k];
        for (int n = nums.length; n > 0; n--) {
            if (freqNumListMap.containsKey(n)) {
                List<Integer> list = freqNumListMap.get(n);
                for (Integer integer : list) {
                    result[--k] = integer;
                    if (k == 0) {
                        return result;
                    }
                }
            }
        }

        return result;
    }
}
