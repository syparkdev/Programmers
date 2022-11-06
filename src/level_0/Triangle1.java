package level_0;

public class Triangle1 {
	
	public int triangle1(int[] sides) {
		
		int max = 0;
		int sum = 0;
		
		//가장 긴 변 찾기, 모든 변의 합 구하기
		for(int i = 0;i < sides.length;i++) {
			if(max < sides[i]) { max = sides[i]; }
			sum += sides[i];
		}
		
		// 삼각형 가능 불가능 구분
		return (sum - max) > max ? 1 : 2;
	}

}
