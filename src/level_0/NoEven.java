package level_0;

//���� n�� �޾� �迭�� 1���� n������ Ȧ���� ��� �޼ҵ�

public class NoEven {
	
	public int[] noEven (int n) {
		
		int[] answer = {};
		
		//n�� Ȧ������ ¦�������� ���� �迭�� ũ�⸦ �ٸ��� �Ҵ�
		//Ȧ�� �迭�� ���ڸ��� n�� �̸� ��´�
		if (n % 2 == 0) {
			answer = new int[n / 2];
		}
		else {
			answer = new int[n / 2 + 1];
			answer[n / 2] = n;
		}
		
		//�迭�� �� �ڸ��� Ȧ���� ��´�
		for (int i = 0; i < n / 2; i++) {
			answer[i] = i * 2 + 1;
		}
		
		return answer;
	}

}
