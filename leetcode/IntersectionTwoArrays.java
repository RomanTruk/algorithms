package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }

    private static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> nums1Set = new HashSet<>();
        for (int num : nums1) {
            nums1Set.add(num);
        }

        Set<Integer> intersections = new HashSet<>();
        for (int num : nums2) {
            if (nums1Set.contains(num)) {
                intersections.add(num);
            }
        }

        int[] result = new int[intersections.size()];
        int index = 0;
        for (Integer num : intersections) {
            result[index] = num;
            index++;
        }

        return result;
    }
}
