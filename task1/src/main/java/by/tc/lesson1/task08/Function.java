package by.tc.lesson1.task08;

import by.tc.lesson1.task03.*;

public class Function {
	private double x;
	private double y;

	public double getY() {
		return y;
	}

	public Function(double x0) throws NotANumberException {
		x = x0;
		if (Double.isNaN(x))
			throw new NotANumberException("Not a number as parameter");
		if (x < 3) {
			y = 1 / (x * x * x - 6);
		} else if (x == Double.POSITIVE_INFINITY) {
			y = Double.NEGATIVE_INFINITY;// предел при x стремящемся к +inf равен -inf, но java думает
			// что полученное число NaN(т.к inf складывается с -inf). я доопределила функцию
		} else {
			y = -x * x + 3 * x + 9;
		}
	}
}
