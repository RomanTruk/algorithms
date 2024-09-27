package leetcode;

public class LongestSubarrayAfterDeletingOneElement {
    public static void main(String[] args) {
        int[] nums = {0, 1, 1, 1, 0, 1, 1, 0, 1};
        System.out.println(longestSubarray(nums));
    }

    private static int longestSubarray(int[] nums) {
        int i = 0;
        int j = 0;
        int zeroCount = 0;

        while (i < nums.length) {
            if (nums[i] == 0) {
                zeroCount++;
            }

            if (zeroCount > 1) {
                if (nums[j] == 0) {
                    zeroCount--;
                }
                j++;
            }

            i++;
        }

        return i - j - 1;
    }
}
