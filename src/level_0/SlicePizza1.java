package level_0;

public class SlicePizza1 {
	
	public int slicePizza (int n) {
		
		return n % 7 == 0 ? n / 7 : n / 7 + 1;
	}

}
