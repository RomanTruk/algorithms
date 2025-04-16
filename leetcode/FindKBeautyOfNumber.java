package leetcode;

public class FindKBeautyOfNumber {
    public static void main(String[] args) {
        System.out.println(divisorSubstrings(430043, 2));
    }

    public static int divisorSubstrings(int num, int k) {
        if (num == 0) {
            return 0;
        }
        int count = 0;
        String number = String.valueOf(num);

        for (int i = 0; i <= number.length() - k; i++) {
            int divisor = Integer.parseInt(number.substring(i, i + k));

            if (divisor != 0 && num % divisor == 0) {
                count++;
            }
        }

        return count;
    }
}
