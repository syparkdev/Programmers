package level_0;

//�ִ������� ���ϴ� �޼ҵ�
//��� �󵵰� ���� �� ���� static���� ������

public class Gcd {
	
	public static int getGcd (int num1, int num2) {

		if (num2 == 0)
			return num1;
		else
			return getGcd(num2, num1 % num2);
		
	}

}
