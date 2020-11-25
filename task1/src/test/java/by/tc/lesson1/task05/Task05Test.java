package by.tc.lesson1.task05;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class Task05Test {

	private Task05 task5 = new Task05();

	@Test
	public void testTrue() throws NegativeParameterException {
		boolean expected = true;
		boolean actual = task5.isPerfect(8128);
		assertEquals(expected, actual);
	}

	@Test
	public void testFalse() throws NegativeParameterException {
		boolean expected = false;
		boolean actual = task5.isPerfect(368889);
		assertEquals(expected, actual);
	}

	@Test
	public void testManyOperations() throws NegativeParameterException {
		boolean expected = false;
		boolean actual = task5.isPerfect(Integer.MAX_VALUE);
		assertEquals(expected, actual);
	}

	@Test
	public void testNegParameterException() {
		try {
			task5.isPerfect(Integer.MIN_VALUE);
			Assert.fail("Exception expected");
		} catch (NegativeParameterException ex) {
			assertEquals("Number must be positive", ex.getMessage());
		}
	}

	@Test(expected = ArithmeticException.class)
	public void testArithmeticException() throws NegativeParameterException {
		task5.isPerfect(1 / 0);
	}

}
