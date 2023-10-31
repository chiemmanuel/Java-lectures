package lecture6;

public class VolatileExample {

	private volatile static int number;
	
	public static void main(String[] args) {
		Thread readerThread = new Thread(() -> {
			int temp = 0;
			while (true) {
				if (temp != number) {
					temp = number;
					System.out.println("Reader : value of counter = " + number);
				}
			}
		});
		Thread writerThread = new Thread (() -> {
			for (int i = 0; i < 5; i++) {
				number++;
				System.out.println("Writer changed value to = "+ number);
				try {
					Thread.sleep(3000);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.exit(0);
		}
				
				);
				readerThread.start();
				writerThread.start();
	}
}
