package leetcode;

public class MonotonicArray {
    public boolean isMonotonic(int[] nums) {
        if (nums.length <= 2) {
            return true;
        }

        boolean isDecr = true;
        boolean isIncr = true;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                isIncr = false;
            }
            if (nums[i - 1] < nums[i]) {
                isDecr = false;
            }
        }

        return isDecr || isIncr;
    }
}
