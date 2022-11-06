package level_0;

//좌표를 배열로 받아 몇 사분면에 있는지 반환하는 메소드

public class Coordinate {
	
	public int coordinate(int[] dot) {
		
		if(dot[0] > 0) {
			if(dot[1] > 0)
				return 1;
			else
				return 4;
		}
		
		else {
			if(dot[1] > 0)
				return 2;
			else
				return 3;
		}
		
	}

}
