package leetcode;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        int result = findMaxConsecutiveOnes(nums);
        System.out.println(result);
    }

    private static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;

        for (int num : nums) {
            if (num == 1) {
                count += 1;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }

        return max;
    }
}
