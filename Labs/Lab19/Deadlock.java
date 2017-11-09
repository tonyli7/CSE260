import java.util.concurrent.*;
import java.util.concurrent.locks.*;

public class Deadlock {
    static ReentrantLock lock1 = new ReentrantLock();
    static ReentrantLock lock2 = new ReentrantLock();

    public static void main(String[] args) {
        //     Create a thread pool with two threads
     	  // MyTask t1 = new MyTask(1);
	  // t1.start();
	  // MyTask t2 = new MyTask(2);
	  // t2.start();
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(new MyTask(1));
        executor.execute(new MyTask(2));
        executor.shutdown();
    }
    public static class MyTask implements Runnable {
        int n;
        MyTask(int n){ 
		this.n = n; 
	  }
        public void run() {
            try {
                if (n == 1) {
                    lock1.lock();
                    System.out.println("Mytask 1 gets lock 1.");
                    Thread.sleep(1000);
                    System.out.println("Mytask 1 tries to get lock 2.");
                    lock2.lock();
                    System.out.println("Mytask 1 succeeds.");
                } else {
                    lock2.lock();
                    System.out.println("Mytask 2 gets lock 2.");
                    Thread.sleep(1000);
                    System.out.println("Mytask 2 tries to get lock 1.");
                    lock1.lock();
                    System.out.println("Mytask 2 succeeds.");
                }
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
