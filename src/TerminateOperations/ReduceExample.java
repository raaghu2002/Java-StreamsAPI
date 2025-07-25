package TerminateOperations;

import java.util.Arrays;
import java.util.List;

public class ReduceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> arr = Arrays.asList(2,3,4,5,1,6,9,8,7);
		
		int res = arr.stream()
			.reduce(0 , (a , b) -> (a + b));
		
		System.out.println(res);
			

	}

}
