package tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import hm3.ex1;

public class TestEx1 {

	@Test
	public void test1() {
		assertTrue(ex1.check(2, 3, 5));
	}

	@Test
	public void test2() {
		assertTrue(!ex1.check(2, -13, 5));
	}
}