package IntermediateOperations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		List<Integer> arr = Arrays.asList(2,3,2,6,9,8,4,5,1,6,9,8,7);
//		
//		List<Integer> res = arr.stream()
////			.sorted()
//			.sorted(Comparator.reverseOrder())
//			.collect(Collectors.toList());
//		
//		System.out.println(res);
		
		List<String> str = Arrays.asList("Apple", "Banana" , "cat" , "Dog" , "Elephant");
		
		List<String> res = str.stream()
//								.sorted(Comparator.reverseOrder())
//								.sorted(Comparator.comparingInt(String::length))
								.sorted(Comparator.comparingInt(String::length).reversed())
								.collect(Collectors.toList());
		
		System.out.println(res);

	}

}
