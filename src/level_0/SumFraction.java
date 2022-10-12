package level_0;

//분자의 합을 기약분수로 반환하는 메소드

public class SumFraction {
	
	
	public int[] SumFraction(int denum1, int num1, int denum2, int num2) {
		
        int[] answer = {};
        
        //분모를 그대로 곱한 뒤 분자끼리 더한다
        answer[0] = num1 * num2;
        answer[1] = (denum1 * num2) + (denum2 * num1);
        
        //최대공약수를 구한다
        int gcd = Gcd.getGcd(answer[0], answer[1]);
        
        //약분한다
        for (int i = 0;i < answer.length;i++) {
        	
        	answer[i] = answer[i] / gcd;
        }
        
        return answer;
    }

}