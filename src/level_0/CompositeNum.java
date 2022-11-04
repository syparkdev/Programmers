package level_0;

public class CompositeNum {
	
	public int compositeNums(int n) {
		Integer primeNumCnt = 0;
		
		for (int num = 1;num <= n;num++) {
			if (isPrime(num)) {
				primeNumCnt++;
			}
		}
		return n - primeNumCnt;
	}
	
	public Boolean isPrime(int num) {
		
		for (int divider = 2;divider < num;divider++) {
			if (num % divider == 0) {
				return false;
			}
		}
		return true;
	}
}