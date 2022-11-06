package level_0;

public class TallerThanMe {
	
	public int tallerThanMe(int[] array, int height) {
		
		int cnt = 0;
		
		for(int i : array) {
			if(i > height)
				cnt++;
		}
		
		return cnt;
	}

}
