package level_0;

import java.util.*;

public class Morse1 {
	
	public static String morse1(String letter) {
		
		//answer, 모스부호, 해시맵, letter token 선언
		String answer = "";
		String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--",
				"-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		HashMap<String, Character> decoder = new HashMap<>();
		StringTokenizer token = new StringTokenizer(letter, " ");
		
		//해시맵 작성
		for(int i = 0; i < morse.length; i++) {
			
			decoder.put(morse[i], (char)('a' + i));
		}
		
		//answer 작성
		while(token.hasMoreTokens()) {
			
			answer += decoder.get(token.nextToken());
		}
		
		return answer;
	}
	
}
