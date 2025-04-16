package leetcode;

import java.util.Arrays;

public class FrequencyTheMostFrequentElement {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);

        long totalSum = 0;
        int leftIndex = 0;
        int maxFreq = 0;

        for (int rightIndex = 0; rightIndex < nums.length; rightIndex++) {
            totalSum += nums[rightIndex];

            while ((long) (rightIndex - leftIndex + 1) * nums[rightIndex] - totalSum > k) {
                totalSum -= nums[leftIndex];
                leftIndex++;
            }

            maxFreq = Math.max(maxFreq, rightIndex - leftIndex + 1);
        }

        return maxFreq;
    }
}
