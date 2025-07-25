package TerminateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class AnyMatchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> arr = Arrays.asList(1,5,3,2,8,4);
		
		Optional<Boolean> checkAnyMatch = Optional.of(arr.stream().anyMatch(num -> num % 2 == 0));
		
		System.out.println(checkAnyMatch);

	}

}
