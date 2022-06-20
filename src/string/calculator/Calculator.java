package string.calculator;

import org.junit.platform.commons.util.StringUtils;

public class Calculator {

	public static int add(String numbers) {
		if(!checkIfStringIsNotEmpty(numbers))
			return 0;
		
		int sum = 0;
		return sum;
	}
	
	private static boolean checkIfStringIsNotEmpty(String numbers) {
		return StringUtils.isNotBlank(numbers);
	}
}
