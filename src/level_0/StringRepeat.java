package level_0;

//���ڿ��� ������ �޾� �� ���ڸ� ������ŭ �ݺ��ϴ� ���ڿ��� ��ȯ�ϴ� �޼ҵ�

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
