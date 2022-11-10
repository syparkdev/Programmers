package level_0;

public class Factorial {
	public int factorial(int n) {
        int facResult = 1;
        int idx = 0;
        
        while (facResult <= n) {
        	facResult *= (idx + 1);
        	idx++;
        }
        return idx - 1;
    }
}