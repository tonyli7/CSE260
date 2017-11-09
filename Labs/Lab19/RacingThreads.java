import java.util.concurrent.*;
public class RacingThreads{

    public static void main(String[] args){

	ExecutorService executor = Executors.newFixedThreadPool(2);
	executor.execute(new Car("McQueen"));
	executor.execute(new Car("Betsy"));
	executor.shutdown();
    }

    static class Car implements Runnable{

	private String name;

	public Car(String n){
	    name = n;
	}
	
	public void run(){
	    for (int i = 0; i < 100; i++){
		System.out.println(name + " is in the lead!");
	       
	    }
	    System.out.println(name + " finished");
	    
	}
    }
}
