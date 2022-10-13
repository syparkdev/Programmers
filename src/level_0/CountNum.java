package level_0;

public class CountNum {
	
	public int countNum(int[] array, int num) {
		
		int cnt = 0;
		
		for(int i : array) {
			if(i == num)
				cnt++;
		}
		
		return cnt;
	}

}
