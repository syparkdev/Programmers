package level_0;

public class CntDivisor {
	
	public int cntDivisor(int n) {
		
		int answer = 0;
		
		for (int i = 1; i <= n; i++) {
			
			if (n % i == 0) answer++;
		}

		return answer;
	}

}
