package level_0;

//최대공약수를 구하는 메소드
//사용 빈도가 높을 것 같아 static으로 선언함

public class Gcd {
	
	public static int getGcd (int num1, int num2) {

		if (num2 == 0)
			return num1;
		else
			return getGcd(num2, num1 % num2);
		
	}

}
