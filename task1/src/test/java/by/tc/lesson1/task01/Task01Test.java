package by.tc.lesson1.task01;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class Task01Test {

	private Task01 task1 = new Task01();

	@Test
	public void testNegative() {
		int actual = task1.squareOfLastNum(-898883213);
		int expected = 9;
		assertEquals(expected, actual);
	}

	@Test
	public void testPositive() {
		int actual = task1.squareOfLastNum(1738830222);
		int expected = 4;
		assertEquals(expected, actual);
	}

	@Test
	public void testZero() {
		int actual = task1.squareOfLastNum(000);
		int expected = 0;
		assertEquals(expected, actual);
	}

	@Test
	public void testInf() {
		int actual = task1.squareOfLastNum(Integer.MAX_VALUE);
		int expected = 9;
		assertEquals(expected, actual);
	}

	@Test
	public void testException() {
		try {
			task1.squareOfLastNum(-55 / 0);
			fail("Exception expected");
		} catch (ArithmeticException ex) {
			assertEquals("/ by zero", ex.getMessage());
		}
	}

	@Test
	public void testCast() {
		int actual = task1.squareOfLastNum((int) (-55. / 2));
		int expected = 9;
		assertEquals(expected, actual);
	}

}
