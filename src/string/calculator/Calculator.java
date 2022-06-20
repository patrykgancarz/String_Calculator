package string.calculator;

import org.junit.platform.commons.util.StringUtils;

public class Calculator {
	
	public static int add(String numbers) {
		String delimiter = ",|\n";
		if (stringIsEmpty(numbers))
			return 0;
		if (numbers.startsWith("//")) {
			delimiter = "" + numbers.charAt(2);
			numbers = numbers.substring(4);
		}
		String[] splitNumbers = numbers.split(delimiter);
		int sum = 0;
		for (String separatedNumber : splitNumbers)
			sum += stringToInt(separatedNumber);
		return sum;
	}
	
	private static boolean stringIsEmpty(String numbers) {
		return StringUtils.isBlank(numbers);
	}
	private static int stringToInt(String number) {
		return Integer.parseInt(number);
	}
}
