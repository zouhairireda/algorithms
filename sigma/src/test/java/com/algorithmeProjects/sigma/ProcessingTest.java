package com.algorithmeProjects.sigma;

import org.junit.Before;
import org.junit.Test;

public class ProcessingTest {

	private Processing processing;

	@Before
	public void setUp() {
		processing = new Processing(new Equation(852));
	}

	@Test
	public void processTest() {
		processing.process(0, 9999, 0.01, 1, 0.02, 1);
	}
}
