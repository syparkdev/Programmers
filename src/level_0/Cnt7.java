package level_0;

import java.util.ArrayList;
import java.util.List;

public class Cnt7 {
	public int cnt7(int[] array) {
		int cnt = 0;
		
		for (int num : array) {
			List<Integer> brokenNum = breakNum(num);
			
			for (int oneDigit : brokenNum) {
				if(oneDigit == 7) {
					cnt++;
				}
			}
		}
        return cnt;
    }
	
	public List<Integer> breakNum (int num) {
		List<Integer> brokenNum = new ArrayList<>();
		
		while(num  > 0) {
			
			brokenNum.add(num % 10);
			num /= 10;
		}
		
		return brokenNum;
	}
}