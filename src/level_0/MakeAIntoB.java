package level_0;

public class MakeAIntoB {
	public int makeAIntoB(String before, String after) {
		String checkBefore = before;

		for (int i = 0; i < after.length(); i++) {
			String letterFromAfter = after.substring(i, i + 1);
			System.out.println(i + "¹øÂ° " + letterFromAfter);

			if (checkBefore.contains(letterFromAfter)) {
				checkBefore = checkBefore.replaceFirst(letterFromAfter, "");
				System.out.println(checkBefore + ", " + letterFromAfter);
			} else {
				return 0;
			}
		}
		
		if (checkBefore.equals("")) {
			return 1;
		} else {
			return 0;
		}
	}
}