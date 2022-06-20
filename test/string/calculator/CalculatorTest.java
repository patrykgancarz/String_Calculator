package string.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	final void testForEmptyInput() {
		assertEquals(0,Calculator.add(""));
	}
	@Test
	final void testForWhitespaceInput() {
		assertEquals(0,Calculator.add("  "));
	}
	@Test
	final void testForNullInput() {
		assertEquals(0,Calculator.add("null"));
	}
	@Test
	final void testForThreeNumbersInput() {
		assertThrows(TooManyArgumentsException.class, () -> Calculator.add("1,2,3"));
	}

}
