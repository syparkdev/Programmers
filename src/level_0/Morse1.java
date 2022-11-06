package level_0;

import java.util.*;

public class Morse1 {
	
	public static String morse1(String letter) {
		
		//answer, �𽺺�ȣ, �ؽø�, letter token ����
		String answer = "";
		String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--",
				"-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		HashMap<String, Character> decoder = new HashMap<>();
		StringTokenizer token = new StringTokenizer(letter, " ");
		
		//�ؽø� �ۼ�
		for(int i = 0; i < morse.length; i++) {
			
			decoder.put(morse[i], (char)('a' + i));
		}
		
		//answer �ۼ�
		while(token.hasMoreTokens()) {
			
			answer += decoder.get(token.nextToken());
		}
		
		return answer;
	}
	
}
