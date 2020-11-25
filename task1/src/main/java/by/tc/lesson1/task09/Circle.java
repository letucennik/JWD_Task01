package by.tc.lesson1.task09;

import by.tc.lesson1.task03.*;//испорт NotANumberException
import by.tc.lesson1.task05.*;//импорт NegativeParameterException

public class Circle {
	private double R;

	public Circle(double R) throws NegativeParameterException, NotANumberException {
		if (R < 0)
			throw new NegativeParameterException("Radius must be positive");
		if (Double.isNaN(R))
			throw new NotANumberException("Not a number as parameter");
		this.R = R;
	}

	public double getLength() {
		return 2 * Math.PI * R;
	}

	public double getSquare() {
		return Math.PI * R * R;
	}
}
