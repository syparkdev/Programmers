package level_0;

//numbers[0]�� ��ġ�� ������� �� ����� �ǳʶٰ� ���� ���� �� k��°�� ���� ���� ����� ã�� �޼ҵ�

public class CatchBall {
	
	public static int catchBall(int[] numbers, int k) {
		
		return numbers[2 * (k - 1) % numbers.length];
	}

}

