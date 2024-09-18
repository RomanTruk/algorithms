package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MinimumIndexSumTwoLists {
    public static void main(String[] args) {
        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
        String[] result = findRestaurant(list1, list2);
        System.out.println(Arrays.toString(result));
    }

    private static String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> stringIndexFirstListMap = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            stringIndexFirstListMap.put(list1[i], i);
        }

        int minSum = Integer.MAX_VALUE;
        List<String> result = new ArrayList<>();
        for (int i = 0; i < list2.length; i++) {
            String s = list2[i];
            if (stringIndexFirstListMap.containsKey(s)) {
                int sum = i + stringIndexFirstListMap.get(s);
                if (sum < minSum) {
                    minSum = sum;
                    result.clear();
                    result.add(s);
                } else if (sum == minSum) {
                    result.add(s);
                }
            }
        }

        return result.toArray(new String[0]);
    }
}
