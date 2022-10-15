package level_0;

//문자열과 정수를 받아 각 문자를 정수만큼 반복하는 문자열을 반환하는 메소드

public class StringRepeat {

	public static String stringRepeat(String my_string, int n) {

		char[] repeat = new char[my_string.length() * n];

		for (int i = 0; i < repeat.length; i += n) {

			for (int j = 0; j < n; j++) {

				repeat[i + j] = my_string.charAt(i / n);
			}
		}

		return new String(repeat);
	}

}
