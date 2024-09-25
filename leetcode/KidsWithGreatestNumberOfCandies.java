package leetcode;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNumberOfCandies {
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        List<Boolean> result = kidsWithCandies(candies, extraCandies);
        System.out.println(result);
    }

    private static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int count : candies) {
            if (count > max) {
                max = count;
            }
        }

        List<Boolean> result = new ArrayList<>();
        for (int count : candies) {
            result.add(count + extraCandies >= max);
        }

        return result;
    }
}
