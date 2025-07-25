package IntermediateOperations;

import java.util.Arrays;
import java.util.List;

public class LimitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> arr = Arrays.asList(1,2,3,4,5,6);
		
		//Limit works opposite to Skip
		arr.stream()
			.limit(3)
			.forEach(System.out::print);

	}

}
