package leetcode;

import java.util.HashMap;

public class LongestHarmoniousSubsequence {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};
        int result = findLHS(nums);
        System.out.println(result);
    }

    private static int findLHS(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int i : nums) {
            if (map.containsKey(i) && map.containsKey(i + 1)) {
                max = Math.max(max, map.get(i) + map.get(i + 1));
            }
        }

        return max;
    }
}
