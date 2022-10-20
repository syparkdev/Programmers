package level_0;

//�����迭�� �Է¹޾� �ֺ��� ��ȯ�ϴ� �޼ҵ�

import java.util.*;

public class FreqNum {
	
	public int freqNum (int[] array) {
		
		int answer = 0;
		
		//�󵵼� �ؽø� �ۼ�
		HashMap<Integer, Integer> freqTable = new HashMap<>();

		for(int i : array) {
			
			if (!freqTable.containsKey(i))
				freqTable.put(i, 1);
			
			else
				freqTable.put(i, freqTable.get(i) + 1);
		}
		
		//Ű�� ��Ƶ� ���� �迭�� ��ȯ
		Set<Integer> keys = freqTable.keySet();
		Integer[] keysArr = keys.toArray(new Integer[keys.size()]);
		
		//���� ��Ƶ� ����Ʈ 
		ArrayList<Integer> vals = new ArrayList<>();
		
		//����Ʈ�� ���� �Է�
		for(int i : keysArr) {
			vals.add(freqTable.get(i));
		}
		
		//����Ʈ��  ������������ ����
		vals.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}  });
		
		
		if(vals.size() == 1) { answer = keysArr[0]; }
		else if(vals.get(0) == vals.get(1)) { answer = -1; }
		else { 
			for(int i : keysArr) {
				if(vals.get(0) == freqTable.get(i)) {
					answer = i;
				}
			}
		}
			
		return answer;
	}
	
}
