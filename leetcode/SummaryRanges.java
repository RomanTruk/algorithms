package leetcode;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 2, 4, 5, 7};
        List<String> summaryRanges = summaryRanges(nums);
        System.out.println(summaryRanges);
    }

    private static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums.length == 0) return result;
        int firstItem = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1 || nums[i] + 1 != nums[i + 1]) {
                if (nums[i] != firstItem) {
                    result.add(firstItem + "->" + nums[i]);
                } else {
                    result.add(firstItem + "");
                }
                if (i != nums.length - 1) {
                    firstItem = nums[i + 1];
                }
            }
        }

        return result;
    }
}
