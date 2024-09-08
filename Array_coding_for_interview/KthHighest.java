package Array_coding_for_interview;

public class KthHighest {

    public static void main(String[] args) {

        int[] arr = { 1,2,3,4,5,6};
        int k=3;
        for(int i = 0; i< arr.length; i++) {
            int c=1;
            for(int j =0; j< arr.length; j++) {
                if(i!=j) {
                    if(arr[i]<arr[j]){
                        c+=1;
                    }
                }
            }
            if(c==k){
                System.out.println("The "+k+"th highest number is: "+arr[i]);
                return;

            }
        }
    }
}

