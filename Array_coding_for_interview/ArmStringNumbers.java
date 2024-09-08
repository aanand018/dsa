package Array_coding_for_interview;

public class ArmStringNumbers {

    public static void main(String[] args) {
        int num = 153;
        int n2 = num , n3 = num;
        int c = 0;


        while(num!=0) {
            num = num / 10;
            c+=1;
        }
        int sum = 0, rem = 0 ;

        while( n2!=0){
            rem = n2 % 10;
            int pow = 1;
            for( int i = 0; i < c; i++ )
            {
                pow = pow * rem;
            }
            sum = sum + pow;
            n2 = n2 / 10;
             }

        if(sum == n3){
            System.out.println(n3 + " is an Armstrong number");
        }else {
            System.out.println(n3 + " is not an Armstrong number");
        }
    }
}
