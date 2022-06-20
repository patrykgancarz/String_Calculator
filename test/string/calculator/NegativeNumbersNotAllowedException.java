package string.calculator;

public class NegativeNumbersNotAllowedException extends RuntimeException{
	NegativeNumbersNotAllowedException(String negativeNumbers) {
		super("\nNegative argumemnts not allowed!"
				+ "\nYour input contains these negative numbers: \n"
				+ negativeNumbers);
	}
}
