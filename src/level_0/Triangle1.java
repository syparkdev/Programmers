package level_0;

public class Triangle1 {
	
	public int triangle1(int[] sides) {
		
		int max = 0;
		int sum = 0;
		
		//���� �� �� ã��, ��� ���� �� ���ϱ�
		for(int i = 0;i < sides.length;i++) {
			if(max < sides[i]) { max = sides[i]; }
			sum += sides[i];
		}
		
		// �ﰢ�� ���� �Ұ��� ����
		return (sum - max) > max ? 1 : 2;
	}

}
