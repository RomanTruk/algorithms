package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleTwo {
    public static void main(String[] args) {
        System.out.println(getRow(3));
    }

    private static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(List.of(1));

        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> prevRow = triangle.get(i - 1);
            List<Integer> row = new ArrayList<>();
            row.add(1);

            for (int j = 1; j < i; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            row.add(1);
            triangle.add(row);
        }

        return triangle.get(rowIndex);
    }
}
