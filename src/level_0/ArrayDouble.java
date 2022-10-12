package level_0;

//배열의 원소에 *2를 해서 반환하는 메소드

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