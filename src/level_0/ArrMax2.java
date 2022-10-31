package level_0;

import java.util.Arrays;

public class ArrMax2 {
	
	public int arrMax2(int[] numbers) {
		
		Arrays.sort(numbers);
		
		return Math.max(numbers[0] * numbers[1], numbers[numbers.length - 2] * numbers[numbers.length - 1] );
	}

}
