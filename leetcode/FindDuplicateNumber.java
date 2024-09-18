package leetcode;

public class FindDuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {3, 1, 3, 4, 2};
        System.out.println(findDuplicate(nums));
    }

    private static int findDuplicate(int[] nums) {
        int[] arr = new int[nums.length];

        for (int num : nums) {
            int index = num - 1;
            if (arr[index] < 0) {
                return num;
            } else {
                arr[index] -= num;
            }
        }

        return -1;
    }
}
