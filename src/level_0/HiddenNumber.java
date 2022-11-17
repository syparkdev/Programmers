package level_0;

public class HiddenNumber {
	public static int hiddenNumber (String my_string){
		int answer = 0;
		String[] numbers = my_string.split("\\D+");
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i].length() > 0) {
				answer += Integer.parseInt(numbers[i]);
			}
		}
		return answer;
	}
}