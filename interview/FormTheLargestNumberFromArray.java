package interview;

import java.util.Arrays;

public class FormTheLargestNumberFromArray {
    public static void main(String[] args) {
        int[] numbers = {9, 10, 1, 64, 18, 2, 20, 51};
        System.out.println(formTheLargestNumberFromArray(numbers));
    }

    private static String formTheLargestNumberFromArray(int[] arr) {
        String[] strArr = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            strArr[i] = String.valueOf(arr[i]);
        }

        Arrays.sort(strArr, (a, b) -> {
            String order1 = a + b;
            String order2 = b + a;
            return order2.compareTo(order1);
        });

        if (strArr[0].equals("0")) {
            return "0";
        }

        StringBuilder largestNumber = new StringBuilder();
        for (String num : strArr) {
            largestNumber.append(num);
        }

        return largestNumber.toString();
    }
}
