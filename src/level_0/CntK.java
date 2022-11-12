package level_0;

public class CntK {
    public int cntK(int i, int j, int k) {
        int cnt = 0;
        
        for (int num = i; num <= j; num++) {
        	cnt += cntForOne(num, k);        	
        }
        return cnt;
    }
    
    public int cntForOne(int num, int k) {
    	int cnt = 0;
    	
    	while (num > 0) {
    		if (num % 10 == k) {
    			cnt++;
    		}
    		num /= 10;
    	}
    	return cnt;
    }
}