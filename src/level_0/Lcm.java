package level_0;

public class Lcm {
	
	public static int getLcm (int num1, int num2) {
		
		return num1 * num2 / Gcd.getGcd(num1, num2);
	}

}
