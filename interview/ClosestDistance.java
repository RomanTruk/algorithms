package interview;

import java.util.NoSuchElementException;

public class ClosestDistance {
    public static void main(String[] args) {
        String text = "The Paris Olympics opened with rain on its parade, then blistering "
                      + "heat and, finally, a week of pleasant sunshine.";
        String firstWord = "Paris";
        String secondWord = "with";

        int distant = findClosestDistant(text, firstWord, secondWord);
        System.out.println("The closest distance is " + distant);
    }

    private static int findClosestDistant(String text,
                                          String firstWord,
                                          String secondWord) {
        String[] splitText = text.split("\s");
        int firstWordIndex = -1;
        int secondWordIndex = -1;
        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < splitText.length; i++) {
            if (splitText[i].equals(firstWord)) {
                firstWordIndex = i;
            }
            if (splitText[i].equals(secondWord)) {
                secondWordIndex = i;
            }

            if (firstWordIndex != -1 && secondWordIndex != -1) {
                int currentDistance = Math.abs(secondWordIndex - firstWordIndex);
                if (currentDistance < minDistance) {
                    minDistance = currentDistance;
                }
            }
        }

        if (minDistance == Integer.MAX_VALUE) {
            throw new NoSuchElementException("Word not found");
        }

        return minDistance;
    }
}
