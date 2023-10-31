package lecture3;

public class AnonymousClassThread {

	public static void main(String[] args) {
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Thread number" + Thread.currentThread().getId() + "is running");
			}
		};
		for (int i = 0; i < 3; i++) {
			Thread thread = new Thread(runnable);
			thread.start();
		}
	}
}
