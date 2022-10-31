package level_0;

public class FindNum {
	
	public int solution(int num, int k) {
				
		String numStr = num + "";
		String findThis = k + "";
		
		if(numStr.indexOf(findThis) != -1) {
			
			return numStr.indexOf(findThis) + 1;
		}
		else {
			
			return numStr.indexOf(findThis);
		}
		
	}

}
