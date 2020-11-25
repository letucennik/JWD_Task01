package by.tc.lesson1.task04;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class Task04Test {

	private Task04 task4 = new Task04();

	@Test
	public void testTwoEven() {
		boolean expected = true;
		boolean actual = task4.hasTwoEven(2, -1, -10, 5);
		assertEquals(expected, actual);
	}

	@Test
	public void testAllEven() {
		boolean expected = true;
		boolean actual = task4.hasTwoEven(2, -56, -10, 2737734);
		assertEquals(expected, actual);
	}

	@Test
	public void testOneEven() {
		boolean expected = false;
		boolean actual = task4.hasTwoEven(2, -5, -1, 27377355);
		assertEquals(expected, actual);
	}

	@Test
	public void testNoEven() {
		boolean expected = false;
		boolean actual = task4.hasTwoEven(2849499, -574774747, Integer.MAX_VALUE, 273773999);
		assertEquals(expected, actual);
	}

	@Test
	public void testArithemticException() {
		try {
			task4.hasTwoEven(-55 / 0, 3, 6, 1);
			Assert.fail("Exception expected");
		} catch (ArithmeticException ex) {
			assertEquals("/ by zero", ex.getMessage());
		}
	}

}
