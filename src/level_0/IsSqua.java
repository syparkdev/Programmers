package level_0;

public class IsSqua {
	
	public int isSqua(int n) {
		
		double sqrt = Math.sqrt(n);
		
		return (sqrt - Math.floor(sqrt)) == 0 ? 1 : 2;
	}

}
