package level_0;

public class ReplaceIdx {
	public String replaceIdx(String my_string, int num1, int num2) {
        char[] answer = my_string.toCharArray();
        char  temp = answer[num1];
        
        answer[num1] = answer[num2];
        answer[num2] = temp;
        
        return new String(answer);
    }
}