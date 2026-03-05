package Array_coding_for_interview;

public class PrimeNumbers {

    public static void main(String[] args) {
        int[] findPrime = {1, 2, 3, 4, 5, 6, 7, 8};

     for( int num : findPrime ) {
         for (int i = 2; i*i <= num; i++) {

             if (num % i == 0) {
                 System.out.println(num+ " is not prime number");
             }else System.out.println(num+" is prime number ");
         }
     }



    }
}
