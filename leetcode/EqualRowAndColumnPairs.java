package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EqualRowAndColumnPairs {
    public static void main(String[] args) {
        int[][] grid = {{3, 2, 1}, {1, 7, 6}, {2, 7, 7}};
        System.out.println(equalPairs(grid));
    }

    private static int equalPairs(int[][] grid) {
        Map<List<Integer>, Integer> rowMap = new HashMap<>();

        for (int i = 0; i < grid.length; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < grid.length; j++) {
                row.add(grid[i][j]);
            }
            rowMap.put(row, rowMap.getOrDefault(row, 0) + 1);
        }

        int count = 0;

        for (int j = 0; j < grid.length; j++) {
            List<Integer> col = new ArrayList<>();
            for (int i = 0; i < grid.length; i++) {
                col.add(grid[i][j]);
            }
            count += rowMap.getOrDefault(col, 0);
        }

        return count;
    }
}
