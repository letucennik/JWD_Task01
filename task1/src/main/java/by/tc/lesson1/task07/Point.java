package by.tc.lesson1.task07;

import by.tc.lesson1.task03.*;//для подключения NotANumberException

public class Point implements Comparable<Point> {
	private double x, y;

	public Point(double x, double y) throws NotANumberException {
		if (Double.isNaN(x) || Double.isNaN(y))
			throw new NotANumberException("Not a number");
		this.x = x;
		this.y = y;
	}

	public double distanceToOrigin() {
		return Math.sqrt(x * x + y * y);
	}

	public int compareTo(Point B) {
		return Double.compare(this.distanceToOrigin(), B.distanceToOrigin());
	}

	public boolean isCloserThan(Point B) {
		boolean actual = false;
		if (this.compareTo(B) < 0)
			actual = true;
		return actual;
	}
}
