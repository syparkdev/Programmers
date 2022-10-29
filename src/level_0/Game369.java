package level_0;

import java.util.*;

public class Game369 {
	
	public int game369(int order) {
		
		int cnt = 0;
		List<Integer> numList = new ArrayList<>();
		
		while(order  > 0) {
			
			numList.add(order % 10);
			order /= 10;
		}
		
		for(int i : numList) {
			
			if(i == 3 || i == 6 || i == 9) {
				cnt++;
			}
		}
		
		return cnt;
	}

}
