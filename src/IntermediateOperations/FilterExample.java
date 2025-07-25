package IntermediateOperations;

import java.util.Arrays;
import java.util.List;

public class FilterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> arr = Arrays.asList(2,3,4,5,1,6,9,8,7);
		
		//Print Even numbers
		arr.stream()
			.filter(n -> n % 2 == 0)
			.forEach(System.out::print);
		
		System.out.println();
		
		//Print Odd Numbers
		arr.stream()
			.filter(n -> n % 2 != 0)
			.forEach(System.out::print);

	}

}
