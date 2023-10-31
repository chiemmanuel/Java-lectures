package lecture3;

public class InheritanceThread extends Thread {

public void run(){
	try {
		System.out.println("thread number" + Thread.currentThread().getId() + "is executing");
	} catch (Exception e) {
		e.printStackTrace();
	}
}
public static void main(String[] args) {
	for  (int i = 0; i < 5; i++) {
		Thread thread = new Thread(new InheritanceThread());
		thread.start();
		
	}
}
}