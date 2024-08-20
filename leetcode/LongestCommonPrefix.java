package leetcode;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        String longestCommonPrefix = getLongestCommonPrefix(strs);
        System.out.println(longestCommonPrefix);
    }

    private static String getLongestCommonPrefix(String[] strs) {
        int minLength = getMinLength(strs);
        int index = 0;

        while (index < minLength) {
            for (String str : strs) {
                if (str.charAt(index) != strs[0].charAt(index)) {
                    return strs[0].substring(0, index);
                }
            }
            index++;
        }

        return strs[0].substring(0, index);
    }

    private static int getMinLength(String[] strs) {
        int minLength = Integer.MAX_VALUE;

        for (String str : strs) {
            if (str.length() < minLength) {
                minLength = str.length();
            }
        }

        return minLength;
    }
}
