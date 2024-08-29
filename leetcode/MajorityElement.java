package leetcode;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(nums));
    }

    private static int majorityElement(int[] nums) {
        int result = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                result = nums[i];
                count++;
            } else if (nums[i] == result) {
                count++;
            } else {
                count--;
            }
        }

        return result;
    }
}
