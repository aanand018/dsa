package Array_coding_for_interview;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int t = 7;
        int n = arr.length;

        Map<Integer,Integer> m = new HashMap<>();


        for(int i = 0; i< n; i++) {
            int c = t - arr[i];
            if(m.containsKey(c)){
                System.out.println("Two numbers that add up to " + t + " are [" + m.get(c)+","+i+"]");

            }
            m.put(arr[i], i);
        }
    }
}
