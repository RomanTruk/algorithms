package leetcode;

public class NumberOfSegmentsInString {
    public int countSegments(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        String[] strings = s.split(" ");
        int count = 0;

        for (String str : strings) {
            if (!str.isEmpty()) {
                count++;
            }
        }

        return count;
    }
}
