package level_0;

import java.util.Arrays;

//�迭�� �߾Ӱ��� ��ȯ�ϴ� �޼ҵ�

public class Median {
	
	public int median (int array[]) {
		
		int midIndex = array.length / 2;
		
		Arrays.sort(array);
		
		return array[midIndex];
	}


}
