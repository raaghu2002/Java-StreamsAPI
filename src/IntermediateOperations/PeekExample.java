package IntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PeekExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> arr = Arrays.asList(2,3,4,5,1,6,9,8,7);
		
		List<Integer> squrtList = arr.stream()
			.map(num -> num * num)
			.peek(System.out::println)
			.collect(Collectors.toList());
		

	}

}
