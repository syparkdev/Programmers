package level_1;

//�ڿ��� n�� �޾� n�� �ڸ����� ���� ���ϴ� �޼ҵ�

public class SumJaritsu {
	
	public static int sumJaritsu (int n) {
		
		int sum = 0;
		
		for (int i = n; i > 0; i /= 10) {
			
			sum += i % 10;
		}
		
		return sum;
	}
	
}
