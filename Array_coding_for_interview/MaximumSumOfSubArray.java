package Array_coding_for_interview;

public class MaximumSumOfSubArray {
    public static void main(String[] args) {

        int[] aray = {-5 , -1 , -8 , -9};//{34, -50, 42, 14, -5, 86};

        int maxSum = aray[0];


        for(int i = 0; i < aray.length-1; i++) {
            int currentSum = aray[i];

            for(int j = i+1; j < aray.length ; j++) {

                currentSum = currentSum+aray[j];
                if(currentSum > maxSum) {
                    maxSum = currentSum;
                }


            }



        }


        System.out.println(maxSum);
    }
}
