package Array_coding_for_interview;

import java.util.LinkedList;

public class K2thApproach {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 1;
        int n = arr.length;
        LinkedList<Integer> rotatted = new LinkedList<Integer>();

        for(int i = 0 ; i < k; i++){
            rotatted.add(arr[n - i -1]);

        }

        for(int i = 0; i < n-k; i++){
            rotatted.add(arr[i]);
        }
        System.out.println(rotatted);
    }
}
