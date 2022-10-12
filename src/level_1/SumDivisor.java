package level_1;

//정수 n을 받아 n의 약수를 전부 더하는 메소드

public class SumDivisor {

	public static int sumDivisor(int n) {

		int sum = 0;

		for (int i = 1; i <= n; i++) {
			
			if (n % i == 0) sum += i;
		}

		return sum;
	}
	
}