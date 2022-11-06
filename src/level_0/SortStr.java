package level_0;

import java.util.Arrays;

public class SortStr {
	
	public String sortStr(String my_string) {
		
		char[] charArr = my_string.toLowerCase().toCharArray();
		
		Arrays.sort(charArr);
		
		String answer = new String(charArr);
		
		return answer;
	}
	
}
