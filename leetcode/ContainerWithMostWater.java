package leetcode;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height));
    }

    private static int maxArea(int[] height) {
        int maxArea = 0;
        int leftPointer = 0;
        int rightPointer = height.length - 1;

        while (leftPointer < rightPointer) {
            if (height[leftPointer] < height[rightPointer]) {
                maxArea = Math.max(maxArea, height[leftPointer] * (rightPointer - leftPointer));
                leftPointer += 1;
            } else {
                maxArea = Math.max(maxArea, height[rightPointer] * (rightPointer - leftPointer));
                rightPointer -= 1;
            }
        }

        return maxArea;
    }
}
