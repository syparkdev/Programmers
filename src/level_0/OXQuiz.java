package level_0;

import java.util.*;

public class OXQuiz {
	public String[] oxQuiz(String[] quiz) {
		String[] answer = new String[quiz.length];
		
		for (int index = 0;index < answer.length;index++) {
			answer[index] = OXcalculate(quiz[index]);
		}

		return answer;
	}

	public String OXcalculate(String quiz) {
		List<String> formulaAnswerSplit = Arrays.asList(quiz.split(" = "));
		int calculated = calculate(formulaAnswerSplit.get(0));
		int expected = Integer.parseInt(formulaAnswerSplit.get(1));
		String quizAnswer = "";

		if (calculated == expected) {
			quizAnswer = "O";
		} else if (calculated != expected) {
			quizAnswer = "X";
		}
		return quizAnswer;
	}

	public int calculate(String formula) {
		List<String> splited = Arrays.asList(formula.split(" "));
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