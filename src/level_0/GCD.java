package level_0;

//�ִ������� ���ϴ� �޼ҵ�
//��� �󵵰� ���� �� ���� static���� ������

public class GCD {
	
	public static int getGCD (int num1, int num2) {

		if (num2 == 0)
			return num1;
		else
			return getGCD(num2, num1 % num2);
		
	}

}
