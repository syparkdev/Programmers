package level_0;

//�迭�� �Է¹ް� �迭�� Ȧ���� ¦�� ������ �迭�� ��ȯ�ϴ� �޼ҵ�

public class EvenOddCnt {
	
	public static int[] evenOddCnt(int[] num_list) {
		
		int[] answer = {0, 0};
		
		for(int i : num_list) {
			
			if(i % 2 == 0)
				answer[0]++;
			
			else
				answer[1]++;
		}
		
		return answer;
	}
	
}
