package leetcode;

public class CanPlaceFlowers {
    public static void main(String[] args) {
        int[] flowerbed = {0, 0, 1, 0, 0};
        System.out.println(canPlaceFlowers(flowerbed, 1));
    }

    private static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;

        if (flowerbed[0] == 0 && flowerbed.length == 1) {
            return true;
        } else if (flowerbed[0] == 0 && flowerbed[1] == 0) {
            flowerbed[0] = 1;
            count++;
        }

        for (int i = 1; i < flowerbed.length; i++) {
            if (i == flowerbed.length - 1) {
                if (flowerbed[i] == 0 && flowerbed[i - 1] == 0) {
                    flowerbed[i] = 1;
                    count++;
                }
            } else if (flowerbed[i - 1] == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                flowerbed[i] = 1;
                count++;
            }
        }

        return count >= n;
    }
}
