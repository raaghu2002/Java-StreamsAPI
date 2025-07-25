package TerminateOperations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MinMaxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> arr = Arrays.asList(1,6,2,3,5,8,4,9);
		
		Optional<Integer> min = arr.stream().min(Comparator.naturalOrder());
		Optional<Integer> max = arr.stream().max(Comparator.naturalOrder());
		
		System.out.println("Min value : " + min + "\n" + "Max value : " + max);
		
		

	}

}
