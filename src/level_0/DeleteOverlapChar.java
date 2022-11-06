package level_0;

public class DeleteOverlapChar {
	public String deleteOverlapChar(String my_string) {
        String answer = "";
        
        for (int i = 0; i < my_string.length(); i++) {
        	if (!answer.contains(my_string.charAt(i) + "")) {
        		answer += my_string.charAt(i) + "";
        	}
        }
        return answer;
    }
}