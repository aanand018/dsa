package Array_coding_for_interview;

import java.util.Arrays;

public class PlusOne {

    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        // Traverse the array from the last digit
        for (int i = n - 1; i >= 0; i--) {
            // If the digit is less than 9, just increment and return the array
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // If the digit is 9, it becomes 0 and carry is propagated to the next digit
            digits[i] = 0;
        }

        // If all the digits were 9, then the array would be like [0, 0, 0...]
        // So we need an additional digit at the beginning
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1; // The most significant digit is now 1
        return newNumber;
    }

    public static void main(String[] args) {
        int[] arr = {1, 9, 9};
        int[] result = plusOne(arr);
        System.out.println(Arrays.toString(result)); // Output: [1, 2, 5]
    }
}
