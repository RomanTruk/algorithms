package interview;

import java.util.NoSuchElementException;

public class UniqueLetterInString {
    public static void main(String[] args) {
        String text = "The Paris Olympics opened with rain on its parade";
        Character uniqueLetter = findUniqueLetter(text);
        System.out.println(uniqueLetter);
    }

    private static char findUniqueLetter(String str) {
        int[] charCount = new int[256];

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            charCount[currentChar]++;
        }

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (charCount[currentChar] == 1) {
                return currentChar;
            }
        }

        throw new NoSuchElementException("Unique letter not found");
    }
}
