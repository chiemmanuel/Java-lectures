package lecture6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorPool implements Runnable {

	private String message;
	
	public ExecutorPool(String msg) {
		this.message = msg;
		
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+ "Start receiving message: "+ message);
		try {
			Thread.sleep(3000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" End.");
	}
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(3);
		
		for (int i = 0; i < 10; i++) {
			Runnable workeRunnable = new ExecutorPool("" + i);
			executor.execute(workeRunnable);
		}
		executor.shutdown();
		while (!executor.isTerminated()) {
		}
		System.out.println("Finished all threads");
	}
}
