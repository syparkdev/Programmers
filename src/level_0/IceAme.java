package level_0;

public class IceAme {
	
	//정수 money를 입력받고 최대 몇 개의 아아메를 사고 얼마가 남는지 계산하는 메소드 
	
	public int[] iceAme(int money) {
		
		int[] answer = new int[2];
		final int ICEAME = 5500;
		
		answer[0] = money / ICEAME;
		answer[1] = money % ICEAME;
		
		return answer;
	}

}
