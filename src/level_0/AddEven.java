package level_0;

//정수 n을 입력받아 0부터 n까지 짝수의 합을 구하는 메소드

public class AddEven {
	
	public int AddEven(int n) {
        int answer = 0;

		for(int i = 2;i <= n;i+=2) {
			answer += i;
		}
		
        return answer;
    }
}