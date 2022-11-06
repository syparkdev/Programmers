//정수 배열과 정수를 받아 정수 배열에서 정수의 배수인 원소만 선택한 배열을 반환하는 메소드

package level_0;

import java.util.ArrayList;

public class CollectMultiple {
	
	public int[] collectMultiple(int n, int[] numlist) {
		
		ArrayList<Integer> collected = new ArrayList<>();
		
		for(int i : numlist) {
			
			if(i % n == 0) {
				collected.add(i);
			}
		}
		
		int[] answer = collected.stream().mapToInt(Integer::intValue).toArray();
		
		return answer;
	}

}
