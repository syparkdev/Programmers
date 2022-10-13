package level_0;

import java.util.Arrays;

//배열의 중앙값을 반환하는 메소드

public class Median {
	
	public int median (int array[]) {
		
		int midIndex = array.length / 2;
		
		Arrays.sort(array);
		
		return array[midIndex];
	}


}
