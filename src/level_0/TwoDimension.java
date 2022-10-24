package level_0;

public class TwoDimension {
	
	public int[][] twoDimension(int[] num_list, int n) {
		
		int[][] answer = new int[num_list.length / n][n];
		
		for(int i = 0; i < answer.length; i++) {
			for(int j = 0; j < n; j++) {
				
				answer[i][j] = num_list[i * n + j];
			}
		}
		
		return answer;
	}
	
}
