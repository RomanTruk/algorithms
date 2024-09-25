package leetcode;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String s = "  hello world  ";
        System.out.println(reverseWords(s));
    }

    private static String reverseWords(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        int end = s.length() - 1;

        while (end >= 0) {
            while (end >= 0 && s.charAt(end) == ' ') {
                end--;
            }

            if (end < 0) {
                break;
            }

            int start = end;
            while (start >= 0 && s.charAt(start) != ' ') {
                start--;
            }

            if (!stringBuilder.isEmpty()) {
                stringBuilder.append(' ');
            }
            stringBuilder.append(s, start + 1, end + 1);
            end = start - 1;
        }

        return stringBuilder.toString();
    }
}
