package by.tc.lesson1.task02;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class Task02Test {

	private Task02 task2 = new Task02();

	@Test
	public void testSimple() throws IncorrectYearException, IncorrectMonthException {
		int actual = task2.numberOfDays(2002, 1);
		int expected = 31;
		assertEquals(expected, actual);
	}

	@Test
	public void testLeap() throws IncorrectYearException, IncorrectMonthException {
		int actual = task2.numberOfDays(1900, 2);
		int expected = 28;
		assertEquals(expected, actual);
	}

	@Test
	public void testMonthException() throws IncorrectYearException {
		try {
			task2.numberOfDays(3949955, -4667);
			Assert.fail("Exception expected");
		} catch (IncorrectMonthException ex) {
			assertEquals("Incorrect month", ex.getMessage());
		}
	}

	@Test
	public void testYearException() throws IncorrectMonthException {
		try {
			task2.numberOfDays(0, 12);
			Assert.fail("Exception expected");
		} catch (IncorrectYearException ex) {
			assertEquals("Incorrect year", ex.getMessage());
		}
	}

	@Test
	public void testArithmeticException() throws IncorrectYearException, IncorrectMonthException {
		try {
			task2.numberOfDays(0, 12 / 0);
			Assert.fail("Exception expected");
		} catch (ArithmeticException ex) {
			assertEquals("/ by zero", ex.getMessage());
		}
	}

}
