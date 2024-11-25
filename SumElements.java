package java8program;

import java.util.Arrays;

public class SumElements {

	public static void main(String []args) {
		
		int [] arrays = {2,7,5,4,3};
		
		int sum = Arrays.stream(arrays).sum();
		
		System.out.println(sum);
	}
}
