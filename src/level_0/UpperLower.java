package level_0;

public class UpperLower {
	
	public static String upperLower(String my_string) {
		
		String answer = "";
		char[] charArr = my_string.toCharArray();
		
		for(char c : charArr) {
			
			int i = (int)c;
			
			if(i >= 97) { i -=32; }
			else { i += 32; }
			
			answer += (char)i;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		
		int i = 'a';
		int j = 'A';
		
		i += 1;
		
//		System.out.println((char)i + "\n" + (char)j);
		System.out.println(upperLower("Olive"));
	}
}
