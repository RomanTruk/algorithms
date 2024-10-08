package leetcode;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumThree {
    public static void main(String[] args) {
        int k = 3;
        int n = 7;
        System.out.println(combinationSum3(k, n));
    }

    private static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        findCombinations(1, k, n, new ArrayList<>(), result);
        return result;
    }

    private static void findCombinations(int start,
                                         int k,
                                         int target,
                                         List<Integer> current,
                                         List<List<Integer>> result) {
        if (target == 0 && current.size() == k) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i <= 9; i++) {
            if (i > target) break;
            current.add(i);
            findCombinations(i + 1, k, target - i, current, result);
            current.remove(current.size() - 1);
        }
    }
}
