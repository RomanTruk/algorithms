package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaxAverageStudent {
    public static void main(String[] args) {
        String[][] studentMarks = {
                {"James", "70"},
                {"Fernando", "90"},
                {"Nick", "60"},
                {"James", "10"}
        };

        String topStudent = findStudentWithMaxAverage(studentMarks);
        System.out.println("The student with the highest average is: " + topStudent);
    }

    private static String findStudentWithMaxAverage(String[][] studentMarks) {
        Map<String, List<Integer>> studentScores = new HashMap<>();

        Arrays.stream(studentMarks).forEach(studentMark -> {
            String name = studentMark[0];
            int mark = Integer.parseInt(studentMark[1]);
            studentScores.putIfAbsent(name, new ArrayList<>());
            studentScores.get(name).add(mark);
        });

        double maxAverage = Double.NEGATIVE_INFINITY;
        String topStudent = null;

        for (Map.Entry<String, List<Integer>> entry : studentScores.entrySet()) {
            String name = entry.getKey();
            List<Integer> scores = entry.getValue();

            double sum = scores.stream().reduce(Integer::sum).orElse(0);

            double average = sum / scores.size();

            if (average > maxAverage) {
                maxAverage = average;
                topStudent = name;
            }
        }

        return topStudent;
    }
}
