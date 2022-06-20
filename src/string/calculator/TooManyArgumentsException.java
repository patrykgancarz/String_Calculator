package string.calculator;

public class TooManyArgumentsException extends RuntimeException {
	TooManyArgumentsException(int numberOfArguments) {
		super("Too many arguments passed in input string! Maximum number of arguments is 2!"
				+"Your input has "+ numberOfArguments + " arguments");
	}

}
