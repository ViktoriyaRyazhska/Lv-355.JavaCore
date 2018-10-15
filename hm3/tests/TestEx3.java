package tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import hm3.HTTPError;
import hm3.ex3;

public class TestEx3 {

	@Test
	public void testErrorMethod() {
		assertTrue(ex3.errorMethod(402, null)==HTTPError.PaymentRequired);
	}

}
