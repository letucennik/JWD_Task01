package by.tc.lesson1.task10;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import by.tc.lesson1.task03.NotANumberException;

public class TanTest {

	@Test
	public void testSimple() throws NotANumberException, InfiniteParameterException, UnreachableResultException {
		Tan tg = new Tan(Math.PI * 1. / 6, Math.PI * 1. / 4, Math.PI * 1. / 36);
		double[] expected = new double[] { 0.57735, 0.70021, 0.83910, 1.000 };
		Assert.assertArrayEquals(expected, tg.getValues(), 1e-4);
	}

	@Test
	public void testSimpleReverse() throws NotANumberException, InfiniteParameterException, UnreachableResultException {
		Tan tg = new Tan(Math.PI * 1. / 4, Math.PI * 1. / 6, -Math.PI * 1. / 36);
		double[] expected = new double[] { 1.000, 0.83910, 0.70021, 0.57735 };
		Assert.assertArrayEquals(expected, tg.getValues(), 1e-4);
	}

	@Test
	public void testNan() throws InfiniteParameterException, UnreachableResultException {
		try {
			Tan tg = new Tan(Math.PI * 1. / 6, Math.PI * 1. / 4, Double.NaN);
			fail("Exception expected");
		} catch (NotANumberException ex) {
			assertEquals("Not a number as parameter", ex.getMessage());
		}
	}

	@Test
	public void testInf() throws NotANumberException, UnreachableResultException {
		try {
			Tan tg = new Tan(Double.NEGATIVE_INFINITY, Math.PI * 1. / 4, 0);
			fail("Exception expected");
		} catch (InfiniteParameterException ex) {
			assertEquals("Infinite number as parameter", ex.getMessage());
		}
	}

	@Test
	public void testWrongStep() throws NotANumberException, InfiniteParameterException {
		try {
			Tan tg = new Tan(0, Math.PI * 1. / 4, 0);
			fail("Exception expected");
		} catch (UnreachableResultException ex) {
			assertEquals("Can not reach b, try another step", ex.getMessage());
		}
	}

}
