package getDayName;

import java.util.Calendar;
import java.util.Locale;

public class GetDayName {

	private static int[] days = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static String[] weeks = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };

	private int findStandardDay(String standardWeek) {
		for (int i = 0; i < weeks.length; i++) {
			if (standardWeek == weeks[i])
				return i;
		}
		return 0;
	}

	private int sumDaysUntilA(int a) {
		int sumDays = 0;

		for (int i = 0; i < a; i++)
			sumDays += days[i];

		return sumDays;
	}

	private String getDayName(int a, int b) {
		// String standardWeek = "FRI";
		// int standardDay = findStandardDay(standardWeek);

		int days = sumDaysUntilA(a - 1) + (b - 1);

		// days = Math.abs(weeks.length - ((days % weeks.length) +
		// standardDay));

		return weeks[days % weeks.length];
	}

	public String getDayName2(int month, int day) {
		Calendar cal = new Calendar.Builder().setCalendarType("iso8601").setDate(2016, month - 1, day).build();
		return cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, new Locale("ko-KR")).toUpperCase();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GetDayName getDayName = new GetDayName();
		int a = 9, b = 30;

		System.out.println(getDayName.getDayName(a, b));
		System.out.println(getDayName.getDayName(4, 6));
		System.out.println(getDayName.getDayName(5, 8));
		System.out.println(getDayName.getDayName(5, 24));
		System.out.println(getDayName.getDayName(9, 15));

	}

}
