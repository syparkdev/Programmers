package level_0;

public class ArrMax {
	
	public int[] arrMax(int[] array) {
		
		int[] answer = new int[2];
		
		//array���� ���� ū �� ���ϱ�
		for(int i = 0;i < array.length;i++) {
			
			if(array[i] > answer[0]) { 
				answer[0] = array[i]; 
				answer[1] = i;
			}
		}
		
		return answer;
	}

}
