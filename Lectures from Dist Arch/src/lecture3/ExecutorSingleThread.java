package lecture3;

import java.util.concurrent.*;

public class ExecutorSingleThread {
	public void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(5);
		executor.execute(()-> {System.out.println("Thread number" + Thread.currentThread().getId()+ "is running");});
	}
}
