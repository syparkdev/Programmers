package level_0;

import java.util.*;

public class ArrDivisor {
	
	public Object[] arrDivisor(int n) {
		
		//n�� ����� ArrayList��
		ArrayList<Integer> divisor = new ArrayList<>();
		
		for(int i = 1;i <= n;i++) {
			if(n % i == 0) { divisor.add(i); }
		}
		
		//����� �������� ����
		divisor.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1-o2;
			}
		});
		
		return divisor.toArray();
	}

}
