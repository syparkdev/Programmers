package level_0;

//int를 받아 float로 계산하고 다시 int로 리턴하는 메소드

public class DivMul {
	public int solution(int num1, int num2)	{
		return (int)((float)num1 / (float)num2 * 1000);
	}
}