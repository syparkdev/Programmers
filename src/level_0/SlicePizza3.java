package level_0;

public class SlicePizza3 {
	
	public int slicePizza3 (int slice, int n) {
		
		return n % slice == 0 ? n / slice : n / slice + 1;
	}

}
