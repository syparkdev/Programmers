package level_0;

//������ ���� ���м��� ��ȯ�ϴ� �޼ҵ�

public class SumFraction {
	
	
	public int[] SumFraction(int denum1, int num1, int denum2, int num2) {
		
        int[] answer = {};
        
        //�и� �״�� ���� �� ���ڳ��� ���Ѵ�
        answer[0] = num1 * num2;
        answer[1] = (denum1 * num2) + (denum2 * num1);
        
        //�ִ������� ���Ѵ�
        int gcd = Gcd.getGcd(answer[0], answer[1]);
        
        //����Ѵ�
        for (int i = 0;i < answer.length;i++) {
        	
        	answer[i] = answer[i] / gcd;
        }
        
        return answer;
    }

}