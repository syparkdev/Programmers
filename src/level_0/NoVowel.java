package level_0;

public class NoVowel {
	
	public String noVowel(String my_string) {
		
		String answer = my_string.replaceAll("[aeiou]", "");
		
		return answer;
	}

}
