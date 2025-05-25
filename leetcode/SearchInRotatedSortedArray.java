package leetcode;

public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int leftIdx = 0;
        int rightIdx = nums.length - 1;

        while (leftIdx <= rightIdx) {
            int midIdx = (leftIdx + rightIdx) / 2;
            int mid = nums[midIdx];

            if (mid == target) {
                return midIdx;
            } else if (mid >= nums[leftIdx]) {
                if (nums[leftIdx] <= target && target <= mid) {
                    rightIdx = midIdx - 1;
                } else {
                    leftIdx = midIdx + 1;
                }
            } else {
                if (mid <= target && target <= nums[rightIdx]) {
                    leftIdx = midIdx + 1;
                } else {
                    rightIdx = midIdx - 1;
                }
            }
        }

        return -1;
    }
}
