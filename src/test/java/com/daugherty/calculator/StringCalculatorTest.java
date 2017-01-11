package com.daugherty.calculator;

import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class StringCalculatorTest {

	@Rule
	public final ExpectedException exception = ExpectedException.none();

	@Test
	public void testStringCalculatorExists() {
		StringCalculator calculator = new StringCalculator();

		assertNotNull(calculator);
	}

	@Test
	public void testAddThrowsUnsupportedOperationException() {
		StringCalculator calculator = new StringCalculator();
		
		exception.expect(UnsupportedOperationException.class);
		exception.expectMessage("You can delete the test for this exception.");
		
		calculator.add("");
	}

}
