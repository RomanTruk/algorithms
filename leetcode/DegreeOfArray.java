package leetcode;

import java.util.HashMap;

public class DegreeOfArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 1};
        System.out.println(findShortestSubArray(nums));
    }

    private static int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> numCountMap = new HashMap<>();
        HashMap<Integer, Integer> numFirstPositionMap = new HashMap<>();
        int degree = 1;
        int minLength = 1;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            numFirstPositionMap.putIfAbsent(num, i);
            int numDegree = numCountMap.getOrDefault(num, 0) + 1;
            numCountMap.put(num, numDegree);
            if (numDegree > degree) {
                degree = numDegree;
                minLength = i - numFirstPositionMap.get(num) + 1;
            } else if (numCountMap.get(num) == degree) {
                minLength = Math.min(minLength, i - numFirstPositionMap.get(num) + 1);
            }
        }

        return minLength;
    }
}
