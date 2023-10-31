package practice;

import java.util.Arrays;

public class ArrayExercises {

	public static void ArraySort() {
		int[] arr = {12, 10, 6, 2, 1, 6, 11};
		Arrays.sort(arr);
		for (int num : arr) {
			System.out.print(num + " * ");
		}
	}
	
	public static void main(String args[]) {
		int a[] = new int[args.length];
		for(int i = 0; i < args.length; i++) {
			a[i] = Integer.parseInt(args[i]);
		}
		Arrays.sort(a);
		for (int num : a) {
			System.out.println(num);
		}
	}
	

}
