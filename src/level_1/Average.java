package level_1;

//평균을 구하는 메소드

public class Average {
	
	public double average(int[] arr) {
		
        double sum = 0;
        
        for(int i : arr) {
        	sum += i;
        }
        
        return sum / arr.length;
    }

}