package TerminateOperations;

import java.util.Arrays;
import java.util.List;

public class CountExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> arr = Arrays.asList(1,3,5,6,9,7,4,5,2,5);
		
		System.out.println(arr.stream().count());

	}

}
