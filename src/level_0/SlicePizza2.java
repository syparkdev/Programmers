package level_0;

public class SlicePizza2 {
	
//	6과 n의 최소공배수를 구해서 답은 6으로 나눠서 반환
	public int slicePizza2 (int n) {
		
		return Lcm.getLcm(6, n) / 6;
	}

}
