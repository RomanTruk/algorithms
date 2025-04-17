package leetcode;

public class MaximumValueOfStringInArray {
    public int maximumValue(String[] strs) {
        int max = 0;

        for (String str : strs) {
            if (isLetterContains(str)) {
                max = Math.max(max, str.length());
            } else {
                max = Math.max(max, Integer.parseInt(str));
            }
        }

        return max;
    }

    private boolean isLetterContains(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                return true;
            }
        }

        return false;
    }
}
