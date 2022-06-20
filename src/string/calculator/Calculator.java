package string.calculator;

import org.junit.platform.commons.util.StringUtils;

public class Calculator {

	private static String DELIMITER = ",|\n";
	
	public static int add(String numbers) {
		
		if(stringIsEmpty(numbers))
			return 0;
		String[] splitNumbers = numbers.split(DELIMITER);
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
