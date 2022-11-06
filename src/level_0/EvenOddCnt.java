package level_0;

//배열을 입력받고 배열의 홀수와 짝수 갯수를 배열로 반환하는 메소드

public class EvenOddCnt {
	
	public static int[] evenOddCnt(int[] num_list) {
		
		int[] answer = {0, 0};
		
		for(int i : num_list) {
			
			if(i % 2 == 0)
				answer[0]++;
			
			else
				answer[1]++;
		}
		
		return answer;
	}
	
}
