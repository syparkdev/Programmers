package level_0;

//���ڿ����� ���� ���ڿ��� �����ϴ� �޼ҵ�

public class DeleteChar {

	public String deleteChar(String my_string, String letter) {

		String answer = "";
		String[] strArr = new String[my_string.length()];
		strArr = my_string.split(letter);
		
		for(int i = 0; i < strArr.length;i++) {
			
			answer = answer.concat(strArr[i]);
		}
		
		return answer;
	}
	
}
