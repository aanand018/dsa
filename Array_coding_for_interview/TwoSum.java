package BinaryTreeImplementations.Array_coding_for_interview;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {


    public static int[] twoSum(int[] nums, int target) {

        int[] indexes = new int[2];
        int key = 0;
    //    int sum = 0;

        for(int value = key+1;value<=nums.length-1;value++){

          int  sum = nums[key]+nums[value];

            if(sum==target){
                indexes[0] = key;
                indexes[1] = value;
                return indexes;
            }
            if(value == nums.length - 1){

                value=++key;

            }

        }
        System.out.println("end ");
        return indexes;
    }


    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int t = 7;
        int n = arr.length;

        int[] nums = {2,5,5,11};//{3,2,4};
        int target = 10; // 6;
        int[] result = twoSum(nums,target);

        System.out.println(result[0]+" "+result[1]);
       // Output: [1,2]

        Map<Integer,Integer> m = new HashMap<>();


        for(int i = 0; i< n; i++) {
            int c = t - arr[i];
            if(m.containsKey(c)){
           //     System.out.println("Two numbers that add up to " + t + " are [" + m.get(c)+","+i+"]");

            }
            m.put(arr[i], i);
        }
    }
}
