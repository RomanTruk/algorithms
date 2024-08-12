package interview;

public class TotalNumberCommonDigitsInRange {
    public static void main(String[] args) {
        int from = 10;
        int to = 15;

        int commonDigitsCount = getTotalNumberCommonDigitsInRange(from, to);
        System.out.println("Total number of common digits: " + commonDigitsCount);
    }

    private static int getTotalNumberCommonDigitsInRange(int from, int to) {
        boolean[] digitFound = new boolean[10];

        for (int i = from; i <= to; i++) {
            int number = i;

            while (number > 0) {
                int digit = number % 10;
                digitFound[digit] = true;
                number /= 10;
            }
        }

        int commonDigitsCount = 0;
        for (boolean isFound : digitFound) {
            if (isFound) {
                commonDigitsCount++;
            }
        }

        return commonDigitsCount;
    }
}
