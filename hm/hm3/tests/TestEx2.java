package tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import hm3.ex2;

public class TestEx2 {

	@Test
	public void testMax() {
		assertTrue(ex2.max(5, 3, -208)==5);
	}

	@Test
	public void testMin() {
		assertTrue(ex2.min(5, 3, -208)==-208);
	}

}
