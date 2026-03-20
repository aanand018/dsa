package Array_coding_for_interview;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        // using while loop
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("Using WHILE Loop : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    //    using for loop
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};
        for(int i = 0; i < arr1.length/2; i++){
            int temp = arr1[arr1.length-i-1];
            arr1[arr1.length-i-1] = arr1[i];
            arr1[i] = temp;
        }
        System.out.println("Using FOR Loop : ");
        for (int i : arr1) {
            System.out.print(i + " ");
        }

    }
}
