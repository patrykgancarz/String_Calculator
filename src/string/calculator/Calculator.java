package string.calculator;

import org.junit.platform.commons.util.StringUtils;

public class Calculator {

	private static String delimiter = ",";
	private static int maxNumberOfArguments = 2;
	public static int add(String numbers) {
		
		if(!checkIfStringIsNotEmpty(numbers))
			return 0;
		
		String[] splitNumbers = numbers.split(delimiter);
		checkStringForMaximumNumberOfArguments(splitNumbers, maxNumberOfArguments);
		int sum = 0;
		return sum;
	}
	
	private static boolean checkIfStringIsNotEmpty(String numbers) {
		return StringUtils.isNotBlank(numbers);
	}
	private static void checkStringForMaximumNumberOfArguments(String[] splitNumbers, int maxNumberOfArguments) {
		if (splitNumbers.length > maxNumberOfArguments)
			throw new TooManyArgumentsException(splitNumbers.length);
	}
}
