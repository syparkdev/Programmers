package level_0;

//���� n�� �Է¹޾� 0���� n���� ¦���� ���� ���ϴ� �޼ҵ�

public class AddEven {
	
	public int AddEven(int n) {
        int answer = 0;

		for(int i = 2;i <= n;i+=2) {
			answer += i;
		}
		
        return answer;
    }
}