package com.teamsankya.calculator;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class SubtractionTest {
	@Test
	public void addTest1() {
		int sum = Subtraction.subtract(20, 10);
		assertEquals(10, sum);
	}
}
