package level_0;

import java.util.Arrays;

public class SortStr2 {
	
	public int [] sortStr2(String my_string) {
		
		String numStr = my_string.replaceAll("[a-z]", "");
		char[] numChar = numStr.toCharArray();
		int[] answer = new int[numChar.length];
		
		for(int i = 0;i < answer.length;i++) {
			
			answer[i] = Character.getNumericValue(numChar[i]);
		}
		
		Arrays.sort(answer);
		
		return answer;
	}

}
