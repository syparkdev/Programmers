package level_0;

import java.util.*;

public class Calculator {
	public int calculator(String my_string) {
		List<String> splited = Arrays.asList(my_string.split(" "));
		int answer = Integer.parseInt(splited.get(0));
		
		for (int index = 1; index < splited.size(); index += 2) {
			String symbol = splited.get(index);
			int num = Integer.parseInt(splited.get(index + 1));
			
			if (symbol.equals("+")) {
				answer += num;
			} else if (symbol.equals("-")) {
				answer -= num;
			}
		}
		return answer;
	}
}