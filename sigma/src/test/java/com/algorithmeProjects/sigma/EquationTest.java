package com.algorithmeProjects.sigma;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class EquationTest {

	private Equation equation;

	@Before
	public void setUp() {
		equation = new Equation(800);
	}

	@Test
	public void calculateTest() {

		assertEquals(1.1504136275055167E-6, equation.calculate(), 0);
	}
}
