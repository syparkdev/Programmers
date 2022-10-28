package level_0;

public class HiddenNum {
	
	public int hiddenNum(String my_string) {
		
		int answer = 0;
		
		for(char c : my_string.toCharArray()) {
			
			if((int)c >= 48 && (int)c <=57) {
				answer += ((int)c - 48);
			}
		}
		
		return answer;
	}

}
