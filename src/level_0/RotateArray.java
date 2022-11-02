package level_0;

public class RotateArray {
	public static int[] rotateArray(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        
        if (direction.equals("left")) {
        	for (int i = 1;i < numbers.length;i++) {
        		answer[i - 1] = numbers[i];
        	}
        	answer[answer.length - 1] = numbers[0];
        	
        } else if (direction.equals("right")) {
        	answer[0] = numbers[numbers.length - 1];
        	for (int i = 1;i < numbers.length;i++) {
        		answer[i] = numbers[i - 1];
        	}
        }
        
        return answer;
    }
}
