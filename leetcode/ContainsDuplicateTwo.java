package leetcode;

import java.util.HashMap;

public class ContainsDuplicateTwo {
    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 1};
        int k = 1;
        System.out.println(containsNearbyDuplicate(nums, k));
    }

    private static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> numIndexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (numIndexMap.containsKey(nums[i]) && Math.abs(numIndexMap.get(nums[i]) - i) <= k) {
                return true;
            } else {
                numIndexMap.put(nums[i], i);
            }
        }

        return false;
    }
}
