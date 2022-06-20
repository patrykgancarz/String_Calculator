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
		assertEquals(0,Calculator.add(null));
	}
	@Test
	final void testForThreeNumbersInput() {
		assertThrows(TooManyArgumentsException.class, () -> Calculator.add("1,2,3"));
	}
	@Test
	final void testForOneNumberInput() {
		assertEquals(1,Calculator.add("1"));
	}
	@Test
	final void testForTwoNumbersInput() {
		assertEquals(3,Calculator.add("1,2"));
	}
	@Test
	final void testForNonNumberInput() {
		assertThrows(NumberFormatException.class, () -> Calculator.add("1,x"));
	}
}
