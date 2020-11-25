package by.tc.lesson1.task08;

import static org.junit.Assert.*;

import org.junit.Test;

import by.tc.lesson1.task03.NotANumberException;

public class FunctionTest {

	@Test
	public void testFirstCase() throws NotANumberException {
		Function f = new Function(3);
		double expected = 9;
		double actual = f.getY();
		assertEquals(expected, actual, 1e-6);
	}

	@Test
	public void testSecondCase() throws NotANumberException {
		Function f = new Function(-5);
		double expected = -1. / 131;
		double actual = f.getY();
		assertEquals(expected, actual, 1e-6);
	}

	@Test
	public void testCriticalPoint() throws NotANumberException {
		Function f = new Function(Math.pow(6, 1. / 3));
		double expected = Double.POSITIVE_INFINITY;
		double actual = f.getY();
		assertEquals(expected, actual, 1e-6);
	}

	@Test
	public void testNegInfinity() throws NotANumberException {
		Function f = new Function(Double.NEGATIVE_INFINITY);
		double expected = 0;
		double actual = f.getY();
		assertEquals(expected, actual, 1e-6);
	}

	@Test
	public void testPosInfinity() throws NotANumberException {
		Function f = new Function(Double.POSITIVE_INFINITY);
		double expected = Double.NEGATIVE_INFINITY;
		double actual = f.getY();
		assertEquals(expected, actual, 1e-6);
	}

	@Test
	public void testNan() {
		try {
			Function f = new Function(Double.NaN);
			fail("Exception expected");
		} catch (NotANumberException ex) {
			assertEquals("Not a number as parameter", ex.getMessage());
		}
	}

}
