import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.Random;

public class Sync {

    static Integer sum = new Integer(0);
    
    static class Task {
       
	
	public synchronized void transfer(){
	    sum++;
	}
	
    }
    
    public static void main(String[] args) {
	int target = 900000000;
	//Integer sum = new Integer(0);
	long startTime = System.currentTimeMillis();

	for (int i = 0; i < target; i++){
	    sum++;
	}
	
	long endTime = System.currentTimeMillis();

	System.out.println("Sequential time is " + (endTime - startTime));
	startTime = System.currentTimeMillis();

	int numberOfThreads = 1000;
	sum = new Integer(0);
	//Stuff

	
	//ExecutorService executor = Executors.newFixedThreadPool(numberOfThreads);
	Task[] tasks = new Task[numberOfThreads];
	int i = 0;
	for (; sum < target; i++){
	    //executor.execute(tasks[i]);

	    tasks[i] = new Task();
	    tasks[i].transfer();
	    if (i == numberOfThreads - 1){
		i = 0;
	    }

	}
	// Shut down the executor
	//tasks[i];
	//executor.shutdown();
	// Wait until all tasks are finished
	/*
	while (!executor.isTerminated()) {
	    try {

		Thread.sleep(1);

	    } catch (InterruptedException ex) {

		ex.printStackTrace();

	    }
	}
	*/
	endTime = System.currentTimeMillis();

	System.out.println("Time with " +
			   Runtime.getRuntime().availableProcessors() +
			   " processors: " +
			   (endTime - startTime));

	System.out.println("The parallel version also computes max");
	System.out.println(sum);
 
    }
	// Create a fixed thread pool with the specified number of threads

    
    
    

}
