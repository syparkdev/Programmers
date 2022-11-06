package level_0;

import java.util.Arrays;

//정수 배열을 입력받아 배열 안에서 가장 큰 수 둘을 곱해 반환하는 함수

public class ArrMul {
	
	public int arrMul(int[] numbers) {
		
		Arrays.sort(numbers);
		
		return numbers[numbers.length - 1] * numbers[numbers.length - 2];
	}
	
}
