package level_0;

import java.math.BigInteger;

public class SplitBalls {
	
	public BigInteger splitBalls(int balls, int share) {
		
		BigInteger answer = new BigInteger("1");
		
		//분자의 nPr
		for(int i = 0; i < share; i++) {
			answer = answer.multiply(BigInteger.valueOf(balls - i));
		}
		
		//분모의 r!
		for(int i = 2; i <= share; i++) {
			answer = answer.divide(BigInteger.valueOf(i));
		}
		
		return answer;
	}

}
