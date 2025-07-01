package BinaryTreeImplementations.sliding_window_programs;

public class MaximumSubArrayOfKthSiz {

    public static int maximumSubArray(int[] array, int k) {
        if (array.length < k) return 0;

        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += array[i];
        }

        int maxSum = windowSum;

        for (int i = k; i < array.length; i++) {
            windowSum = windowSum + array[i] - array[i - k]; // Slide the window
            maxSum = Math.max(maxSum, windowSum);
            System.out.println("i -> "+i+ ", k -> " +k+ ", i-k -> "+ (i-k)+ " : windowSum -> " +windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 2;
        int result = maximumSubArray(arr, k);
        System.out.printf("Result: %d%n", result);  // Output: 9
    }
}
