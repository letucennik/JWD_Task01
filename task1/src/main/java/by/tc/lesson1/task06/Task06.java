package by.tc.lesson1.task06;

public class Task06 {
	private int seconds;
	private int minutes;
	private int hours;

	public int getSeconds() {
		return seconds;
	}

	public int getMinutes() {
		return minutes;
	}

	public int getHours() {
		return hours;
	}

	public Task06(int sec) throws SecondsOutOfRangeException {
		if (sec < 1 || sec > 86400)
			throw new SecondsOutOfRangeException("Incorrect input");
		seconds = sec;
		minutes = sec / 60;
		hours = sec / 3600;
	}
}
