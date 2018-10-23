package andriy;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_Task1_2 {
Task1_2 n1 = new Task1_2();
	@Test
	public void testNumber() {
		assertTrue (n1.Number(3.1f, 4.6f, 7) == 3.1f);
	}

}
