package andriy;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_tut1 {
tut1 n1 = new tut1(); 
	@Test
	public void testMax() {
		assertTrue(n1.Max(4, 1, 7)==7);
	}

	@Test
	public void testMin() {
		assertTrue(n1.Min(3, 7, 1)==1);
	}

}
