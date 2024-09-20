package leetcode;

public class MinCostClimbingStairs {
    public static void main(String[] args) {
        int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        System.out.println(minCostClimbingStairsTwo(cost));
    }

    private static int minCostClimbingStairs(int[] cost) {
        for (int i = 2; i < cost.length; i++) {
            cost[i] += Math.min(cost[i - 1], cost[i - 2]);
        }

        return Math.min(cost[cost.length - 1], cost[cost.length - 2]);
    }

    private static int minCostClimbingStairsTwo(int[] cost) {
        int stepOne = 0;
        int stepTwo = 0;
        for (int i = cost.length - 1; i >= 0; i--) {
            int currentStep = cost[i] + Math.min(stepOne, stepTwo);
            stepOne = stepTwo;
            stepTwo = currentStep;
        }

        return Math.min(stepOne, stepTwo);
    }
}
