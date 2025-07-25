package IntermediateOperations;

import java.util.Arrays;
import java.util.List;

public class SkipExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> arr = Arrays.asList(1,2,3,4);
		
		arr.stream()
			.skip(1)
			.forEach(System.out::println);

	}

}
