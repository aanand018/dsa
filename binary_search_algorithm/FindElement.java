package BinaryTreeImplementations.binary_search_algorithm;

public class FindElement {

    public static String binarySearch(int[] arr,int target){
        int left = 0;
        int right = arr.length-1;

        while(left <= right){
            int mid = left + (right-left)/2;
            if(arr[mid] == target){
                return "found";
            }
            if(arr[mid]>target){
                right = mid-1;
            }
            if(arr[mid]<target){
                left = mid+1;
            }
        }
        return "not found";
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,8,9};
        int target = 8;
       String res = binarySearch(arr,target);
        System.out.println(res);
    }
}
