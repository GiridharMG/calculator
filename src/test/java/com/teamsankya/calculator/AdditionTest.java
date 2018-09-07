package com.teamsankya.calculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static junit.framework.TestCase.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class AdditionTest {
	int a;
	int b;
	int expected;
	public AdditionTest(int a, int b, int expected) {
		this.a = a;
		this.b = b;
		this.expected = expected;
	}
	
	@Ignore
	@Test
	public void addTestInt1() {
		int sum = Addition.add(a, b);
		assertEquals(expected, sum);
	}
	@Test
	public void addTestInt2() {
		double sum = Addition.add(10.2, 20.3);
		assertEquals(30.5, sum);
	}
	
	@Parameters
	public static Collection<Integer[]> testParameters() {
		Integer[][] arr = {{0,0,0},
				{-1,-1,-2},
				{1,1,2},
				{50,50,100},
				{99,99,198},
				{100,100,200},
				{101,101,202}};
		List<Integer[]> integers = Arrays.asList(arr);
		return integers;
	}
}








