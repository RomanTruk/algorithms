package leetcode;

public class MergeStringsAlternately {
    public static void main(String[] args) {
        String word1 = "abcd";
        String word2 = "pq";
        System.out.println(mergeAlternately(word1, word2));
    }

    private static String mergeAlternately(String word1, String word2) {
        int length = Math.max(word1.length(), word2.length());
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < length; i++) {
            if (i < word1.length() && i < word2.length()) {
                stringBuilder.append(word1.charAt(i));
                stringBuilder.append(word2.charAt(i));
            } else if (i < word1.length()) {
                stringBuilder.append(word1.charAt(i));
            } else {
                stringBuilder.append(word2.charAt(i));
            }
        }

        return stringBuilder.toString();
    }
}
