package lecture6;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Fibonnacci implements Callable<Integer> {
	Integer n;
	Fibonnacci() {}
	Fibonnacci(Integer n){
		this.n = n;
	}

@Override
public Integer call() throws Exception {
	int sum = 0;
	if (n == null) {
		return sum;
	}
	int n1 = 0, n2 = 1;
	int n3 = 1;
	for (int i = 0; i < n; i++) {
		if (n1 % 2 == 0) {
			sum += n1;
		}
		n3 = n2 + n1;
		n1 = n2;
		n2 = n3;
	}
	System.out.println("Thread name: " + Thread.currentThread().getId());
	return sum;
}

public static void main(String[] args) {
	List<Future<Integer>> list = new ArrayList<Future<Integer>>();
	ExecutorService executor = Executors.newFixedThreadPool(1);
	Fibonnacci task2 = new Fibonnacci(10);
	for (int i = 0; i < 10; i++) {
		Future<Integer> futureResult = executor.submit(task2);
		list.add(futureResult);
	}
	for (Future<Integer> futureResult : list) {
		try {
			System.out.println(new Date().toInstant().getNano() + "::" + futureResult.get());
		}catch (InterruptedException| ExecutionException e) {
			e.printStackTrace();
		}
		executor.shutdown();
	}
	
}
}