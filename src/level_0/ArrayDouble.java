package level_0;

//�迭�� ���ҿ� *2�� �ؼ� ��ȯ�ϴ� �޼ҵ�

public class ArrayDouble {
	
	 public int[] arrayDouble(int[] numbers) {
		 
	        int[] answer = new int[numbers.length];
        	int index = 0;

	        for (int i : numbers) {

	        	answer[index] = i * 2;
	        	index++;
	        	}

	        return answer;
	    }
}