//���� �迭�� ������ �޾� ���� �迭���� ������ ����� ���Ҹ� ������ �迭�� ��ȯ�ϴ� �޼ҵ�

package level_0;

import java.util.ArrayList;

public class CollectMultiple {
	
	public int[] collectMultiple(int n, int[] numlist) {
		
		ArrayList<Integer> collected = new ArrayList<>();
		
		for(int i : numlist) {
			
			if(i % n == 0) {
				collected.add(i);
			}
		}
		
		int[] answer = collected.stream().mapToInt(Integer::intValue).toArray();
		
		return answer;
	}

}
