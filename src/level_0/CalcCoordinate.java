package level_0;

public class CalcCoordinate {
	public int[] calcCoordinate(String[] keyinput, int[] board) {
		int[] answer = new int[2];
		int horizontalRange = (board[0] - 1) / 2;
		int verticalRange = (board[1] - 1) / 2;

		for (String direction : keyinput) {
			switch (direction) {
			case "right" :
				if (answer[0] == horizontalRange)  { continue; }
				answer[0]++;
				break;
			case "left" :
				if (answer[0] == horizontalRange * -1)  { continue; }
				answer[0]--;
				break;
			case "up" :
				if (answer[1] == verticalRange) { continue; }
				answer[1]++;
				break;
			case "down" :
				if (answer[1] == verticalRange * -1) { continue; }
				answer[1]--;
				break;
			}
		}
		return answer;
	}
}