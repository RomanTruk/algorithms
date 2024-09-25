package leetcode;

public class GreatestCommonDivisorOfStrings {
    public static void main(String[] args) {
        String str1 = "ABCABC";
        String str2 = "ABC";
        System.out.println(gcdOfStrings(str1, str2));
    }

    private static String gcdOfStrings(String str1, String str2) {
        if (str1.isEmpty()) {
            return str2;
        }
        if (str2.isEmpty()) {
            return str1;
        }

        if (str1.length() > str2.length()) {
            if (str1.startsWith(str2)) {
                return gcdOfStrings(str1.substring(str2.length()), str2);
            } else {
                return "";
            }
        } else {
            if (str2.startsWith(str1)) {
                return gcdOfStrings(str2.substring(str1.length()), str1);
            } else {
                return "";
            }
        }
    }
}
