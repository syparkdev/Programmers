package level_0;

public class DiceCnt {
	
	public int solution(int[] box, int n) {
		
        int answer = 0;
        
        for(int i = 0;i < box.length;i++) {
        	
        	answer *= box[i] / n;
        }
        
        return answer;
    }

}
