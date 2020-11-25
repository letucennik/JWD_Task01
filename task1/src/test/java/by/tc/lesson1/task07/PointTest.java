package by.tc.lesson1.task07;

import static org.junit.Assert.*;
import org.junit.Test;

import by.tc.lesson1.task03.NotANumberException;

public class PointTest {

	@Test
	public void testFirstCloser() throws NotANumberException {
		Point A = new Point(23.67, 69.0);
		Point B = new Point(50.1, 100.5);
		boolean expected = true;// считаем, что А находится ближе
		boolean actual = A.isCloserThan(B);
		assertEquals(expected, actual);
	}

	@Test
	public void testSecondCloser() throws NotANumberException {
		Point A = new Point(230.67, 69.0);
		Point B = new Point(50.1, 100.5);
		boolean expected = false;// считаем, что B находится ближе
		boolean actual = A.isCloserThan(B);
		assertEquals(expected, actual);
	}

	@Test
	public void testFirstCloserInf() throws NotANumberException {
		Point A = new Point(23.67, 69.0);
		Point B = new Point(Double.POSITIVE_INFINITY, 100.5);
		boolean expected = true;// считаем, что А находится ближе
		boolean actual = A.isCloserThan(B);
		assertEquals(expected, actual);
	}

	@Test
	public void testEqualsInf() throws NotANumberException {
		Point A = new Point(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
		Point B = new Point(Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY);
		boolean actual = true;// считаем, что оба на одинаковом расстоянии
		boolean expected = false;
		if (A.compareTo(B) == 0)
			expected = true;
		assertEquals(expected, actual);
	}

	@Test
	public void testNan() {
		try {
			Point A = new Point(Double.POSITIVE_INFINITY, Double.NaN);
			Point B = new Point(Double.NaN, Double.NEGATIVE_INFINITY);
			fail("Exception expected");
		} catch (NotANumberException ex) {
			assertEquals("Not a number", ex.getMessage());
		}

	}
}
