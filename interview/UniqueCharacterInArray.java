package interview;

import java.util.NoSuchElementException;

public class UniqueCharacterInArray {
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c', 'a', 'b', 'c', 'd', 'e', 'd', 'e', 'x', 'y', 'y'};
        System.out.println(findUniqueCharacterInArray(arr));
    }

    private static char findUniqueCharacterInArray(char[] arr) {
        int[] charCount = new int[256];

        for (char currentChar : arr) {
            charCount[currentChar]++;
        }

        for (char currentChar : arr) {
            if (charCount[currentChar] == 1) {
                return currentChar;
            }
        }

        throw new NoSuchElementException("Unique character not found");
    }
}
