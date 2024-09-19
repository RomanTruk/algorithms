package leetcode;

import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {
    public static void main(String[] args) {
        int[] candyType = {1, 1, 2, 3};
        System.out.println(distributeCandies(candyType));
    }

    private static int distributeCandies(int[] candyType) {
        Set<Integer> candyTypeSet = new HashSet<>();
        for (int type : candyType) {
            candyTypeSet.add(type);
        }

        return Math.min(candyTypeSet.size(), candyType.length / 2);
    }
}
