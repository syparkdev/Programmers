package level_0;

public class ReplaceEnglish {
	public long replaceEnglish(String numbers) {
		EnglishNumber[] engNums = EnglishNumber.values();
		
		for (EnglishNumber engNum : engNums) {
			if (numbers.contains(engNum.name)) {
				numbers = numbers.replace(engNum.name, engNum.value);
			}
		}
		return Long.parseLong(numbers);
	}

	public enum EnglishNumber {
		ONE("one", "1"), TWO("two", "2"), THREE("three", "3"), FOUR("four", "4"), FIVE("five", "5"),
		SIX("six", "6"), SEVEN("seven", "7"), EIGHT("eight", "8"), NINE("nine", "9"), ZERO("zero", "0");

		private final String name;
		private final String value;

		EnglishNumber(String name, String value) {
			this.name = name;
			this.value = value;
		}
	}
}