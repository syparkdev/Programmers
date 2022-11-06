package level_0;

//numbers[0]에 위치한 사람부터 한 사람씩 건너뛰고 공을 던질 때 k번째에 공을 던질 사람을 찾는 메소드

public class CatchBall {
	
	public static int catchBall(int[] numbers, int k) {
		
		return numbers[2 * (k - 1) % numbers.length];
	}

}

