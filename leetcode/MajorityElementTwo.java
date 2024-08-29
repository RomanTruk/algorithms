package leetcode;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementTwo {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        System.out.println(majorityElement(nums));
    }

    private static List<Integer> majorityElement(int[] nums) {
        int firstMajorityElement = 0;
        int secondMajorityElement = 0;

        int firstMajorityElementCount = 0;
        int secondMajorityElementCount = 0;


        for (int num : nums) {
            if (num == firstMajorityElement) {
                firstMajorityElementCount++;
            } else if (num == secondMajorityElement) {
                secondMajorityElementCount++;
            } else if (firstMajorityElementCount == 0) {
                firstMajorityElement = num;
                firstMajorityElementCount++;
            } else if (secondMajorityElementCount == 0) {
                secondMajorityElement = num;
                secondMajorityElementCount++;
            } else {
                firstMajorityElementCount--;
                secondMajorityElementCount--;
            }
        }

        firstMajorityElementCount = 0;
        secondMajorityElementCount = 0;

        for (int num: nums) {
            if (num == firstMajorityElement) {
                firstMajorityElementCount++;
            } else if (num == secondMajorityElement) {
                secondMajorityElementCount++;
            }
        }

        List<Integer> result = new ArrayList<>(2);
        if (firstMajorityElementCount > nums.length / 3) {
            result.add(firstMajorityElement);
        }
        if (secondMajorityElementCount > nums.length / 3) {
            result.add(secondMajorityElement);
        }

        return result;
    }
}
