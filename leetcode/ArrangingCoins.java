package leetcode;

public class ArrangingCoins {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(1));
    }

    public static int arrangeCoins(int n) {
        int prev = 0;
        int count = 0;

        while (n > 0) {
            int current = prev + 1;

            if (n - current >= 0) {
                count++;
            }

            prev = current;
            n -= current;
        }

        return count;
    }
}
