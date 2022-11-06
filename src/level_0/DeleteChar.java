package level_0;

//문자열에서 지정 문자열을 제거하는 메소드

public class DeleteChar {

	public String deleteChar(String my_string, String letter) {

		String answer = "";
		String[] strArr = new String[my_string.length()];
		strArr = my_string.split(letter);
		
		for(int i = 0; i < strArr.length;i++) {
			
			answer = answer.concat(strArr[i]);
		}
		
		return answer;
	}
	
}
