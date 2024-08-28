package leetcode;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        int singleNumber = singleNumber(nums);
        System.out.println(singleNumber);
    }

    private static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result = result ^ num;
        }

        return result;
    }
}
