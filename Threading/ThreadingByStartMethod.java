package Threading;

public class ThreadingByStartMethod  extends Thread{


    public void run() {

        for(int i = 1 ; i < 5 ; i++) {
            System.out.println( i+" Running thread:  " + Thread.currentThread().getName());
        }
        System.out.println("================================");
    }

    public static void main(String[] args) {
        ThreadingByStartMethod t1 = new ThreadingByStartMethod();
        ThreadingByStartMethod t2 = new ThreadingByStartMethod();


        t1.start(); // starts a new thread
        t2.start();


// unpredictable result will be returned in the start method of the thread




    }

}
