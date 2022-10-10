package level_0;

public class ArrayDouble {
	
	 public int[] ArrayDouble(int[] numbers) {
		 
	        int[] answer = new int[numbers.length];
        	int index = 0;

	        for (int i : numbers) {

	        	answer[index] = i * 2;
	        	index++;
	        	}

	        return answer;
	    }
}