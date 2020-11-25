package by.tc.lesson1.task05;

public class Task05 {
	public boolean isPerfect(int n) throws NegativeParameterException {
		if (n < 1)
			throw new NegativeParameterException("Number must be positive");
		return sumOfDividers(n) == n;

	}

	public int sumOfDividers(int n) {
		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0)
				sum += i;
		}
		return sum;
	}
}
