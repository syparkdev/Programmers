package level_0;

//�迭�� �Է¹ް� �� �迭�� ������ �迭�� ��ȯ�ϴ� �޼ҵ�

public class ArrayReverse {
	
	public int[] arrayReverse(int[] num_list) {
		
		int[] answer = new int[num_list.length];
		
		for(int i = 0; i < num_list.length;i++) {
			
			answer[i] = num_list[num_list.length - 1 - i];
		}
		
		return answer;
	}

}
