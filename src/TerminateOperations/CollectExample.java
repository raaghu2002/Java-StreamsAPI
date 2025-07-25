package TerminateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> arr = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		List<Integer> res = arr.stream()
			.map(num -> num * num)
			.collect(Collectors.toList());
		
		res.forEach(System.out::println);

	}

}
