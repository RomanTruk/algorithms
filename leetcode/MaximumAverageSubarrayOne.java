package leetcode;

public class MaximumAverageSubarrayOne {
    public static void main(String[] args) {
        int[] nums = {0, 1, 1, 3, 3};
        int k = 4;
        double result = findMaxAverage(nums, k);
        System.out.println(result);
    }

    private static double findMaxAverage(int[] nums, int k) {
        double currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }

        double maxSum = currentSum;

        for (int i = k; i < nums.length; i++) {
            currentSum = currentSum + nums[i] - nums[i - k];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        return maxSum / k;
    }

}
