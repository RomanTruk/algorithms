package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class IntersectionTwoArraysTwo {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }

    private static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> numCountMap = new HashMap<>();
        for (int num : nums1) {
            numCountMap.put(num, numCountMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> intersections = new ArrayList<>();
        for (int num : nums2) {
            if (numCountMap.containsKey(num) && numCountMap.get(num) > 0) {
                intersections.add(num);
                numCountMap.put(num, numCountMap.get(num) - 1);
            }
        }

        int[] result = new int[intersections.size()];
        for (int i = 0; i < intersections.size(); i++) {
            result[i] = intersections.get(i);
        }

        return result;
    }
}
