package string.calculator;



public class Calculator {
	
	private Calculator() {}
	
	public static int add(String numbers) {
		String delimiter = ",|\n";
		if (stringIsEmpty(numbers))
			return 0;
		if (customDelimiterSelected(numbers)) {
			delimiter = "" + numbers.charAt(2);
			numbers = numbers.substring(4);
		}
		String[] splittedNumbers = numbers.split(delimiter);
		int sum = 0;
		String negativeNumbers = "";
		StringBuilder negativeNumbersList = new StringBuilder(negativeNumbers);
		for (String separatedNumber : splittedNumbers) {
			int number = stringToInt(separatedNumber);
			if (negativeNumberDetector(number)) {
				negativeNumbersList.append(separatedNumber);
				continue;
			}
			if (numberOver1000Detected(number))
				continue;
			sum += number;
		}
		negativeNumbers = negativeNumbersList.toString();
		if (!stringIsEmpty(negativeNumbers))
			throw new NegativeNumbersNotAllowedException(negativeNumbers);
		return sum;
	}

	private static boolean customDelimiterSelected(String numbers) {
		return numbers.startsWith("//");
	}

	private static boolean numberOver1000Detected(int number) {
		return number > 1000;
	}

	private static boolean negativeNumberDetector(int number) {
		return number < 0;
	}
	
	private static boolean stringIsEmpty(String numbers) {
		return numbers == null || numbers.isBlank();
	}
	private static int stringToInt(String number) {
		return Integer.parseInt(number);
	}
}
