package level_1;

//자연수 n을 받아 n의 자릿수를 전부 더하는 메소드

public class SumJaritsu {
	
	public static int sumJaritsu (int n) {
		
		int sum = 0;
		
		for (int i = n; i > 0; i /= 10) {
			
			sum += i % 10;
		}
		
		return sum;
	}
	
}
