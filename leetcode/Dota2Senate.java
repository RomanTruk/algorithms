package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class Dota2Senate {
    public static void main(String[] args) {
        String senate = "RDD";
        System.out.println(predictPartyVictory(senate));
    }

    private static String predictPartyVictory(String senate) {
        Queue<Integer> radiant = new LinkedList<>();
        Queue<Integer> dire = new LinkedList<>();
        int index = 0;

        for (char c : senate.toCharArray()) {
            if (c == 'R') {
                radiant.offer(index++);
            } else {
                dire.offer(index++);
            }
        }

        while (!radiant.isEmpty() && !dire.isEmpty()) {
            if (radiant.peek() < dire.peek()) {
                radiant.offer(index++);
            } else {
                dire.offer(index++);
            }
            dire.poll();
            radiant.poll();
        }

        return radiant.isEmpty() ? "Dire" : "Radiant";
    }
}
