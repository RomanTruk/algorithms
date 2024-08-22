package interview;

public class Sqrt {
    public static void main(String[] args) {
        int sqrt = getSqrt(8);
        System.out.println(sqrt);
    }

    private static int getSqrt(int x) {
        long result = 0;

        while (result * result <= x) {
            result += 1;
        }

        return (int) result - 1;
    }
}
