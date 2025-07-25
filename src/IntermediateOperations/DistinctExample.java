package IntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> arr = Arrays.asList(2,3,2,6,9,8,4,5,1,6,9,8,7);
		
		List<Integer> res = arr.stream()
			.distinct()
			.sorted()
			.collect(Collectors.toList());
		
		System.out.println(res);

	}

}
