package level_0;

import java.util.Arrays;

//���� �迭�� �Է¹޾� �迭 �ȿ��� ���� ū �� ���� ���� ��ȯ�ϴ� �Լ�

public class ArrMul {
	
	public int arrMul(int[] numbers) {
		
		Arrays.sort(numbers);
		
		return numbers[numbers.length - 1] * numbers[numbers.length - 2];
	}
	
}
