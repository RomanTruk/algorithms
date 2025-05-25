package leetcode;

public class GuessNumberHigherOrLower {
    public int guessNumber(int n) {
        int left = 0;
        int right = n;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (guess(mid) == -1) {
                right = mid - 1;
            }
            if (guess(mid) == 1) {
                left = mid + 1;
            }
            if (guess(mid) == 0) {
                return mid;
            }
        }

        return -1;
    }

    private int guess(int num) {
        return -1;
    }
}
