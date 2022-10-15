package level_0;

//문자열을 입력받아 뒤집어 반환하는 메소드

public class StringReverse {

	public String stringReverse(String my_string) {
		
		char[] reverse = new char[my_string.length()];
		
		for(int i = 0;i < my_string.length();i++) {
			
			reverse[i] = my_string.charAt(my_string.length() - 1 - i);
		}
		
		String answer = new String(reverse);
		
		return answer;
	}

}
