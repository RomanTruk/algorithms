package leetcode;

import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision {
    public static void main(String[] args) {
        int[] asteroids = {5, 10, -5};
        System.out.println(Arrays.toString(asteroidCollision(asteroids)));
    }

    private static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int a : asteroids) {
            if (a > 0) {
                stack.push(a);
            } else {
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < -a) {
                    stack.pop();
                }
                if (stack.isEmpty() || stack.peek() < 0)  {
                    stack.push(a);
                }
                if (stack.peek() == -a) {
                    stack.pop();
                }
            }
        }

        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }
}
