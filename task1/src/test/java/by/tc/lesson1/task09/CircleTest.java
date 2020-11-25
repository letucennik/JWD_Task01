package by.tc.lesson1.task09;

import static org.junit.Assert.*;

import org.junit.Test;

import by.tc.lesson1.task03.NotANumberException;
import by.tc.lesson1.task05.NegativeParameterException;

public class CircleTest {

	@Test
	public void testSimple() throws NegativeParameterException, NotANumberException {
		Circle c = new Circle(9);

		double expectedSquare = 254.469;
		double actualSquare = c.getSquare();
		assertEquals(expectedSquare, actualSquare, 1e-3);

		double expectedLength = 56.549;
		double actualLength = c.getLength();
		assertEquals(expectedLength, actualLength, 1e-3);
	}

	@Test
	public void testNegParameterException() throws NotANumberException {
		try {
			Circle c = new Circle(Double.NEGATIVE_INFINITY);
			fail("Exception expected");
		} catch (NegativeParameterException ex) {
			assertEquals("Radius must be positive", ex.getMessage());
		}
	}

	@Test
	public void testNanException() throws NegativeParameterException {
		try {
			Circle c = new Circle(Double.NaN);
			fail("Exception expected");
		} catch (NotANumberException ex) {
			assertEquals("Not a number as parameter", ex.getMessage());
		}
	}

	@Test
	public void testInf() throws NegativeParameterException, NotANumberException {
		Circle c = new Circle(Double.POSITIVE_INFINITY);

		double expectedSquare = Double.POSITIVE_INFINITY;
		double actualSquare = c.getSquare();
		assertEquals(expectedSquare, actualSquare, 1e-3);

		double expectedLength = Double.POSITIVE_INFINITY;
		double actualLength = c.getLength();
		assertEquals(expectedLength, actualLength, 1e-3);
	}

}
