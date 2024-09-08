package Array_coding_for_interview;

public class PrimeNumbers {

    public static void main(String[] args) {
        int[] findPrime = {1, 2, 3, 4, 5, 6, 7, 8};

     for( int num : findPrime ) {
         int c=0;
         for (int i = 1; i <= num; i++) {

             if (num % i == 0){
                 c+=1;

             }
         }
         if(c == 2) {
             System.out.println(num);
         }
     }



    }
}
