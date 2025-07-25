package TerminateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> arr = Arrays.asList(1,5,3,4,2,6,8,7,9,10);
		
		Optional<Integer> firstVal = arr.stream().filter(num -> num % 2 == 0).findFirst();
		
		System.out.println("First value is : " + firstVal);

	}

}
