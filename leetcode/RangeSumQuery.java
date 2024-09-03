package leetcode;

//public class RangeSumQuery {
//    private int[] arr;
//
////    public NumArray(int[] nums) {
////        arr = nums;
////    }
//
//    public int sumRange(int left, int right) {
//        int sum = 0;
//
//        for (int i = left; i <= right; i++) {
//            sum += arr[i];
//        }
//
//        return sum;
//    }
//}

public class RangeSumQuery {
    private int[] sumArr;

//    public NumArray(int[] nums) {
//        sumArr = new int[nums.length + 1];
//        for (int i = 1; i < sumArr.length; i++) {
//            sumArr[i] = sumArr[i - 1] + nums[i - 1];
//        }
//    }

    public int sumRange(int left, int right) {
        return sumArr[right + 1] - sumArr[left];
    }
}
