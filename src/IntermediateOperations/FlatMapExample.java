package IntermediateOperations;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<List<Integer>> listOfList = Arrays.asList(
					Arrays.asList(2,3,5,6),
					Arrays.asList(9,8,1,7)
				);
		
		System.out.println("Before flatten : " + listOfList);
		
		List<Integer> resList = listOfList.stream()
										.flatMap(Collection::stream)
										.sorted()
										.collect(Collectors.toList());
		
		System.out.println("After flatten : " + resList);
		
		

	}

}
