package leetcode;

public class TribonacciNumber {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(tribonacci(n));
    }

    private static int tribonacci(int n) {
        if (n < 3) {
            return n == 0 ? 0 : 1;
        }

        int a = 0;
        int b = 1;
        int c = 1;
        int result = 0;

        for (int i = 3; i <= n; i++) {
            result = a + b + c;
            a = b;
            b = c;
            c = result;
        }

        return result;
    }
}
