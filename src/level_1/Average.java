package level_1;

public class Average {
	
	public double Average(int[] arr) {
		
        double sum = 0;
        
        for(int i : arr) {
        	sum += i;
        }
        
        return sum / arr.length;
    }

}