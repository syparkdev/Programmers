package level_0;

public class IceAme {
	
	//���� money�� �Է¹ް� �ִ� �� ���� �ƾƸ޸� ��� �󸶰� ������ ����ϴ� �޼ҵ� 
	
	public int[] iceAme(int money) {
		
		int[] answer = new int[2];
		final int ICEAME = 5500;
		
		answer[0] = money / ICEAME;
		answer[1] = money % ICEAME;
		
		return answer;
	}

}
