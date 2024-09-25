package leetcode;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 121;
        System.out.println(isPalindrome(num));
    }

    private static boolean isPalindrome(int x) {
        String num = String.valueOf(x);
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = num.length() - 1; i >= 0; i--) {
            stringBuilder.append(num.charAt(i));
        }

        return num.contentEquals(stringBuilder);
    }
}
