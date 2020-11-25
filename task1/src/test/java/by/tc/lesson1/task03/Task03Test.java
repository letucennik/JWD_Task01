package by.tc.lesson1.task03;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class Task03Test {

	private Task03 task3 = new Task03();

	@Test
	public void testSimple() throws NegativeSquareException, NotANumberException {
		double expected = 4.4;
		double actual = task3.squareIn(8.8);
		assertEquals(expected, actual, 1e-6);
	}

	@Test
	// если окружность вписана в квадрат бесконечной площади, то квадрат вписанный в
	// нее
	// также имеет бесконечную площадь
	public void testPosInfifnity() throws NegativeSquareException, NotANumberException {
		double expected = Double.POSITIVE_INFINITY;
		double actual = task3.squareIn(Double.POSITIVE_INFINITY);
		assertEquals(expected, actual, 1e-6);
	}

	@Test
	public void testNegException() throws NotANumberException {
		try {
			task3.squareIn(Double.NEGATIVE_INFINITY);
			Assert.fail("Exception expected");
		} catch (NegativeSquareException ex) {
			assertEquals("Square must be positive", ex.getMessage());
		}
	}

	@Test
	public void testNanException() throws NegativeSquareException {
		try {
			task3.squareIn(Double.NaN);
			Assert.fail("Exception expected");
		} catch (NotANumberException ex) {
			assertEquals("Not a number as parameter", ex.getMessage());
		}
	}
}
