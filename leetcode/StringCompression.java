package leetcode;

public class StringCompression {
    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'c', 'c', 'b', 'b', 'b'};
        System.out.println(compress(chars));
    }

    private static int compress(char[] chars) {
        int write = 0;
        int index = 0;

        while(index < chars.length) {
            char currentChar = chars[index];
            int count = 0;

            while (index < chars.length && chars[index] == currentChar) {
                count++;
                index++;
            }

            chars[write++] = currentChar;

            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        return write;
    }
}
