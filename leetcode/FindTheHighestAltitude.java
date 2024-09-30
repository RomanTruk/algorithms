package leetcode;

public class FindTheHighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-5, 1, 5, 0, -7};
        System.out.println(largestAltitude(gain));
    }

    private static int largestAltitude(int[] gain) {
        int result = 0;
        int altitude = 0;

        for (int g : gain) {
            altitude += g;
            result = Math.max(result, altitude);
        }

        return result;
    }
}
