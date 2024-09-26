package leetcode;

public class StringCompression {
    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'c', 'c', 'b', 'b', 'b'};
        System.out.println(compress(chars));
    }

    private static int compress(char[] chars) {
        if (chars.length == 1) {
            return 1;
        }

        int index = 0;
        int groupCount = 1;

        for (int i = 1; i <= chars.length; i++) {
            if (i == chars.length || chars[i - 1] != chars[i]) {
                chars[index++] = chars[i - 1];

                if (groupCount > 1) {
                    String countStr = String.valueOf(groupCount);
                    for (char c : countStr.toCharArray()) {
                        chars[index++] = c;
                    }
                }
                groupCount = 1;
            } else {
                groupCount++;
            }
        }

        return index;
    }
}
