package by.tc.lesson1.task02;

public class Task02 {
	public int numberOfDays(int year, int month) throws IncorrectYearException, IncorrectMonthException {
		if (year < 1) {
			throw new IncorrectYearException("Incorrect year");
		}
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;
		case 2:
			if (isLeap(year))
				return 29;
			else
				return 28;
		case 4:
			return 30;
		case 6:
			return 30;
		case 9:
			return 30;
		case 11:
			return 30;
		default:
			throw new IncorrectMonthException("Incorrect month");

		}
	}

	// проверка на високосность
	public boolean isLeap(int year) {
		boolean leap = true;
		if (year % 4 != 0 || year % 100 == 0 && year % 400 != 0) {
			leap = false;
		}
		return leap;
	}
}
