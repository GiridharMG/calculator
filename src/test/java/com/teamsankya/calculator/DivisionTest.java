package com.teamsankya.calculator;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class DivisionTest {
	@Test(expected=ArithmeticException.class)
	public void divideTest() {
		int sum = Division.divide(10, 0);
		assertEquals(0, sum);
	}
}
