package level_0;

//정수 n을 받아 배열에 1부터 n까지의 홀수만 담는 메소드

public class NoEven {
	
	public int[] noEven (int n) {
		
		int[] answer = {};
		
		//n이 홀수인지 짝수인지에 따라 배열의 크기를 다르게 할당
		//홀수 배열의 끝자리에 n을 미리 담는다
		if (n % 2 == 0) {
			answer = new int[n / 2];
		}
		else {
			answer = new int[n / 2 + 1];
			answer[n / 2] = n;
		}
		
		//배열의 각 자리에 홀수만 담는다
		for (int i = 0; i < n / 2; i++) {
			answer[i] = i * 2 + 1;
		}
		
		return answer;
	}

}
