package level_0;

public class CutArr {
	
	public int[] cutArr(int[] numbers, int num1, int num2) {
		
		int[] answer = new int[num2 - num1 + 1];
		
		for(int i = 0;i < answer.length;i++) {
			
			answer[i] = numbers[num1 + i];
		}
		
		return answer;
	}

}
