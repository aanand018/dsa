package Threading;

public class ThreadingByRunMethod extends Thread {

    public void run() {
        System.out.println("Running thread: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadingByRunMethod t1 = new ThreadingByRunMethod();
        ThreadingByRunMethod t2 = new ThreadingByRunMethod();

        t1.run();
        t2.run();
    }

}
