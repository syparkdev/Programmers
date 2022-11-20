package level_0;

import java.util.*;

public class CtrlZ {
	public static int ctrlZ(String s) {
		int answer = 0;
		String[] splited = s.split(" ");
		List<Integer> addStack = new ArrayList<>();
		
		for (int index = 0; index < splited.length; index++) {
			if (splited[index].equals("Z") && !addStack.isEmpty()) {
				addStack.remove(addStack.size() - 1);
			} else if (!splited[index].equals("Z")) {
				addStack.add(Integer.parseInt(splited[index]));
			}
		}
		
		for (Integer number : addStack) {
			answer += number;
		}
		return answer;
	}
}