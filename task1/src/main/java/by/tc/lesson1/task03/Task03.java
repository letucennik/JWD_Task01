package by.tc.lesson1.task03;

public class Task03 {
	public double squareIn(double s) throws NegativeSquareException, NotANumberException {
		if (s < 0)
			throw new NegativeSquareException("Square must be positive");
		if (Double.isNaN(s))
			throw new NotANumberException("Not a number as parameter");
		// r=sqrt(s)/2
		// squareIn=2*r*r ������� ����������
		// squareIn=2*s/4=s/2
		// ������� ���������� ������ � 2 ���� ������
		double square = s / 2;
		return square;
	}
}
