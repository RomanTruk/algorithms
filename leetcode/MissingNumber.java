package leetcode;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        System.out.println(getMissingNumber(nums));
    }

    private static int getMissingNumber(int[] nums) {
        int actualSum = 0;
        int expectedSum = 0;

        for (int i = 0; i < nums.length; i++) {
            actualSum += nums[i];
        }

        for (int i = 0; i < nums.length + 1; i++) {
            expectedSum += i;
        }

        return expectedSum - actualSum;
    }
}
