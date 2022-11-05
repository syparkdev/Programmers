package level_0;

public class Decipher {
	
	public String decipher (String cipher, int code) {
		String answer = "";
		
		for (int i = 0;i <= cipher.length();i += code) {
			answer += cipher.charAt(i - 1);
		}
		return answer;
	}
}
