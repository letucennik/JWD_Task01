package by.tc.lesson1.task10;

import by.tc.lesson1.task03.*;

public class Tan {
	private double[] values;
	private double[] arguments;

	public double[] getValues() {
		return values;
	}

	public Tan() {
	}

	public Tan(double a, double b, double h)
			throws NotANumberException, InfiniteParameterException, UnreachableResultException {
		if (Double.isNaN(a) || Double.isNaN(b) || Double.isNaN(h))
			throw new NotANumberException("Not a number as parameter");
		if (Double.isInfinite(a) || Double.isInfinite(b) || Double.isInfinite(h))
			throw new InfiniteParameterException("Infinite number as parameter");
		if (h == 0 || (b > a && h < 0) || (a > b && h > 0))// в этих случаях невозможно достигнуть b из а
			throw new UnreachableResultException("Can not reach b, try another step");
		values = new double[(int) (Math.abs((b - a) / h)) + 1];// здесь хранятся значения функции
		arguments = new double[(int) (Math.abs((b - a) / h)) + 1];// здесь хранятся аргументы функции
		int j = 0;
		double i = a;
		do {
			arguments[j] = i;
			values[j] = Math.tan(i);
			i += h;
			j++;
		} while (j != arguments.length);

	}

	public void print() {
		System.out.println("\t" + "x" + "\t" + "\t" + "y");
		for (int i = 0; i < values.length; i++) {
			System.out.print(String.format("%e", arguments[i]));// для красоты
			System.out.print("  ");
			System.out.println(String.format("%e", values[i]));
		}

	}

	public static void main(String[] args)
			throws NotANumberException, InfiniteParameterException, UnreachableResultException {
		Tan t = new Tan(Math.PI * 3. / 2, Math.PI * 2, Math.PI * 1. / 180);
		t.print();

	}
}
