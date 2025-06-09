package leetcode;

public class FindCenterOfStarGraph {
    public int findCenter(int[][] edges) {
        int[] result = new int[edges.length + 2];

        for(int[] edge : edges) {
            for (int i : edge) {
                result[i]++;

                if (result[i] > 1) {
                    return i;
                }
            }
        }

        return -1;
    }
}
