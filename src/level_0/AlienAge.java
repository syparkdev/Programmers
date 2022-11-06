package level_0;

public class AlienAge {
	
	public static String alienAge(int age) {
		
		Integer wrapAge = Integer.valueOf(age);
		String strAge = wrapAge.toString();
		char[] charAge = strAge.toCharArray();
		
		for(int i = 0;i < charAge.length;i++) {
			
			 charAge[i] = (char)(Character.getNumericValue(charAge[i]) + 97);
		}
		
		 String answer = new String(charAge);
		 
		return answer;
	}

}
