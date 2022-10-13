package level_0;

public class ArrayAvg {
	
	public double arrayAvg (int[] numbers) {
		
		double sum = 0;
		
		for (int i : numbers) {
			sum += i;
		}
		
		return sum / numbers.length;
	}

}
