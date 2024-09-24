package leetcode;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        int result = search(nums, target);
        System.out.println(result);
    }

    private static int search(int[] nums, int target) {
        int startIndex = 0;
        int endIndex = nums.length - 1;

        while (startIndex <= endIndex) {
            int middleIndex = (startIndex + endIndex) / 2;
            int middleItem = nums[middleIndex];

            if (middleItem == target) {
                return middleIndex;
            } else if (middleItem > target) {
                endIndex = middleIndex - 1;
            } else {
                startIndex = middleIndex + 1;
            }
        }

        return -1;
    }
}
