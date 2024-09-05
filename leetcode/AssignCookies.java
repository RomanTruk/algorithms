package leetcode;

import java.util.Arrays;

public class AssignCookies {
    public static void main(String[] args) {
        int[] g = {1, 2};
        int[] s = {1, 2, 3};
        System.out.println(findContentChildren(g, s));
    }

    private static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int gPointer = 0;
        int sPointer = 0;

        while (gPointer < g.length && sPointer < s.length) {
            if (g[gPointer] <= s[sPointer]) {
                gPointer++;
            }
            sPointer++;
        }

        return gPointer;
    }
}
