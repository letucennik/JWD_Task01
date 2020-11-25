package by.tc.lesson1.task06;

import static org.junit.Assert.*;

import org.junit.Test;

public class Task06Test {

	@Test
	public void testSimple() throws SecondsOutOfRangeException {
		Task06 test1 = new Task06(34789);
		int expectedSeconds = 34789;
		int actualSeconds = test1.getSeconds();
		assertEquals(expectedSeconds, actualSeconds);

		int expectedMinutes = 579;
		int actualMinutes = test1.getMinutes();
		assertEquals(expectedMinutes, actualMinutes);

		int expectedHours = 9;
		int actualHours = test1.getHours();
		assertEquals(expectedHours, actualHours);
	}

	@Test
	public void testBorderValue1() throws SecondsOutOfRangeException {
		Task06 test1 = new Task06(1);
		int expectedSeconds = 1;
		int actualSeconds = test1.getSeconds();
		assertEquals(expectedSeconds, actualSeconds);

		int expectedMinutes = 0;
		int actualMinutes = test1.getMinutes();
		assertEquals(expectedMinutes, actualMinutes);

		int expectedHours = 0;
		int actualHours = test1.getHours();
		assertEquals(expectedHours, actualHours);
	}

	@Test
	public void testBorderValue2() throws SecondsOutOfRangeException {
		Task06 test1 = new Task06(86400);
		int expectedSeconds = 86400;
		int actualSeconds = test1.getSeconds();
		assertEquals(expectedSeconds, actualSeconds);

		int expectedMinutes = 1440;
		int actualMinutes = test1.getMinutes();
		assertEquals(expectedMinutes, actualMinutes);

		int expectedHours = 24;
		int actualHours = test1.getHours();
		assertEquals(expectedHours, actualHours);
	}

	@Test
	public void testSecondsException() {
		try {
			Task06 t = new Task06(0);
			fail("Exception expected");
		} catch (SecondsOutOfRangeException ex) {
			assertEquals("Incorrect input", ex.getMessage());
		}
	}

}
