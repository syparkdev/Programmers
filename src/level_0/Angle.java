package level_0;

public class Angle {
	
	public int angle(int n) {
		
		if(n == 180)
			return 4;
		else if(n == 90)
			return 2;
		else if(90 < n && n < 180)
			return 3;
		else if(0 < n && n < 90)
			return 1;
		else
			return 0;
	}

}
