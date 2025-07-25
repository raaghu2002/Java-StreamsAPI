package ParallelStream;

import java.util.Arrays;

public class ParallelStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long[] longArray = new long[1000];
		for(int i = 0 ; i < longArray.length ; i++) {
			longArray[i] = i+1;
		}
		
		long startTime = System.currentTimeMillis();

		long sequentialSum = Arrays.stream(longArray).sum();
		
		long endTime = System.currentTimeMillis();
		
		System.out.println(startTime);
		System.out.println(endTime);

	}

}
