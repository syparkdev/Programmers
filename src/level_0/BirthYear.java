package level_0;

//나이를 받아 생년을 리턴하는 메소드

public class BirthYear {
	
	private static final int thisYear = 2022;
    
    public int birthYear(int age) {
    	
        return thisYear - age + 1;
    }
}