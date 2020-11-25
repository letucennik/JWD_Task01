package by.tc.lesson1.task04;

public class Task04 {
	public boolean hasTwoEven(int a, int b, int c, int d) {
		if ((remainder(a) + remainder(b) + remainder(c) + remainder(d)) <= 2)
			return true;
		else
			return false;
	}

	public int remainder(int x) {
		return Math.abs(x) % 2;
	}

}
