package level_0;

//���ڿ��� �Է¹޾� ������ ��ȯ�ϴ� �޼ҵ�

public class StringReverse {

	public String stringReverse(String my_string) {
		
		char[] reverse = new char[my_string.length()];
		
		for(int i = 0;i < my_string.length();i++) {
			
			reverse[i] = my_string.charAt(my_string.length() - 1 - i);
		}
		
		String answer = new String(reverse);
		
		return answer;
	}

}
