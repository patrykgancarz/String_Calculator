package string.calculator;

import org.junit.platform.commons.util.StringUtils;

public class Calculator {

	private static String DELIMITER = ",";
	private static int MAX_NUMBER_OF_ARGUMENTS = 2;
	public static int add(String numbers) {
		
		if(stringIsEmpty(numbers))
			return 0;
		
		String[] splitNumbers = numbers.split(DELIMITER);
		checkStringForMaximumNumberOfArguments(splitNumbers, MAX_NUMBER_OF_ARGUMENTS);
		int sum = 0;
		for (String separatedNumber : splitNumbers)
			sum += stringToInt(separatedNumber);
		return sum;
	}
	
	private static boolean stringIsEmpty(String numbers) {
		return StringUtils.isBlank(numbers);
	}
	private static void checkStringForMaximumNumberOfArguments(String[] splitNumbers, int maxNumberOfArguments) {
		if (splitNumbers.length > maxNumberOfArguments)
			throw new TooManyArgumentsException(splitNumbers.length);
	}
	private static int stringToInt(String number) {
		return Integer.parseInt(number);
	}
}
