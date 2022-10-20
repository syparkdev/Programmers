package level_0;

//정수배열을 입력받아 최빈값을 반환하는 메소드

import java.util.*;

public class FreqNum {
	
	public int freqNum (int[] array) {
		
		int answer = 0;
		
		//빈도수 해시맵 작성
		HashMap<Integer, Integer> freqTable = new HashMap<>();

		for(int i : array) {
			
			if (!freqTable.containsKey(i))
				freqTable.put(i, 1);
			
			else
				freqTable.put(i, freqTable.get(i) + 1);
		}
		
		//키만 모아둔 셋을 배열로 변환
		Set<Integer> keys = freqTable.keySet();
		Integer[] keysArr = keys.toArray(new Integer[keys.size()]);
		
		//값만 모아둘 리스트 
		ArrayList<Integer> vals = new ArrayList<>();
		
		//리스트에 값만 입력
		for(int i : keysArr) {
			vals.add(freqTable.get(i));
		}
		
		//리스트를  내림차순으로 정렬
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
