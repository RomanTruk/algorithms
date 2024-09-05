package leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;

public class RelativeRanks {

    public static final String GOLD_MEDAL = "Gold Medal";
    public static final String SILVER_MEDAL = "Silver Medal";
    public static final String BRONZE_MEDAL = "Bronze Medal";

    public static void main(String[] args) {
        int[] score = {5, 4, 3, 2, 1};
        String[] relativeRanks = findRelativeRanks(score);
        System.out.println(Arrays.toString(relativeRanks));
    }

    private static String[] findRelativeRanks(int[] score) {
        String[] result = new String[score.length];

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);

        for (int i = 0; i < score.length; i++) {
            pq.offer(new int[]{score[i], i});
        }

        int rank = 1;
        while (!pq.isEmpty()) {
            int[] top = pq.poll();
            if (rank == 1) {
                result[top[1]] = GOLD_MEDAL;
            } else if (rank == 2) {
                result[top[1]] = SILVER_MEDAL;
            } else if (rank == 3) {
                result[top[1]] = BRONZE_MEDAL;
            } else {
                result[top[1]] = String.valueOf(rank);
            }
            rank++;
        }

        return result;
    }
}
