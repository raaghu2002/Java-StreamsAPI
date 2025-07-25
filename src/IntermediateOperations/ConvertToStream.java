package IntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConvertToStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Convert primitive array to stream
		int[] arr1 = {2,3,4,5,1,6,9,8,7};
		IntStream resArr1 = Arrays.stream(arr1);
		resArr1.distinct()
		.sorted()
		.forEach(System.out::print);
		
		System.out.println();
		
		//Convert Non-primitive array to stream
		Integer[] arr2 = {2,3,4,5,1,6,9,8,7};
		Stream<Integer> resArr2 = Stream.of(arr2);
		resArr2.distinct()
		.sorted()
		.forEach(System.out::print);
		
		System.out.println();
		
		//Convert Collection Array to stream
		List<Integer> arr3 = Arrays.asList(2,3,4,5,1,6,9,8,7);
		arr3.stream()
		.distinct()
		.sorted()
		.forEach(System.out::print);

	}

}
