package level_0;

public class ArrMax {
	
	public int[] arrMax(int[] array) {
		
		int[] answer = new int[2];
		
		//array에서 가장 큰 값 구하기
		for(int i = 0;i < array.length;i++) {
			
			if(array[i] > answer[0]) { 
				answer[0] = array[i]; 
				answer[1] = i;
			}
		}
		
		return answer;
	}

}
