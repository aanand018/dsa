package BinaryTreeImplementations.sliding_window_programs;

public class AverageOfSubarraySizeK {

    private static double[] findAverages(int[] arr, int k) {

        if(arr.length < k){
            return new double[0];
        }

        double[] result = new double[arr.length - k + 1];
        double windowSum = 0;
        int windowStart = 0;

        for(int windowsEnd = 0; windowsEnd < arr.length; windowsEnd++){
            windowSum += arr[windowsEnd];

            if(windowsEnd >= k-1){
                result[windowStart] = windowSum/k;
                windowSum -= arr[windowStart];
                windowStart++;

            }
        }
        return result;


    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 6, -1, 4, 1, 8, 2};
        int k = 5;
        double[] averages = findAverages(arr, k);

        System.out.println("Averages of subarrays of size " + k + ":");
        for (double avg : averages) {
            System.out.printf("%.2f ", avg);
        }
    }


}
