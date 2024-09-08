package Array_coding_for_interview;

public class KthRotation {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5 };
        int k = 2;

        for(int i=0;i<k;i++){

            int pre=arr[0];
            arr[0] = arr[arr.length-1];

            for(int j=1;j<arr.length;j++){
                int t = arr[j];
                arr[j] = pre;
                pre = t;
            }

        }

        for(int i : arr){
            System.out.print(i + " ");
        }






    }
}
