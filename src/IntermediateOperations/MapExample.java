package IntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> fruits = Arrays.asList("APPLE" , "ball" , "CAT" , "Dog");
		
		List<String> res = fruits.stream()
//			.map(fruit -> fruit.toUpperCase()) or
			.map(String::toUpperCase)
			.collect(Collectors.toList());
		
		res.forEach(System.out::println);
		

	}

}
