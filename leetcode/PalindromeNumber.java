package leetcode;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 121;
        System.out.println(isPalindrome(num));
    }

    private static boolean isPalindrome(int x) {
        String num = String.valueOf(x);
        int left = 0;
        int right = num.length() - 1;

        while (left < right) {
            if (num.charAt(left) != num.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

//    private static boolean isPalindrome(int x) {
//        String num = String.valueOf(x);
//        StringBuilder stringBuilder = new StringBuilder();
//
//        for (int i = num.length() - 1; i >= 0; i--) {
//            stringBuilder.append(num.charAt(i));
//        }
//
//        return num.contentEquals(stringBuilder);
//    }
}
