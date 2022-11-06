package level_0;

//배열을 입력받고 그 배열을 뒤집은 배열을 반환하는 메소드

public class ArrayReverse {
	
	public int[] arrayReverse(int[] num_list) {
		
		int[] answer = new int[num_list.length];
		
		for(int i = 0; i < num_list.length;i++) {
			
			answer[i] = num_list[num_list.length - 1 - i];
		}
		
		return answer;
	}

}
