package problem19;

import java.util.HashMap;

public class GetFirstSundayOfEveryMonth {

	static int[] months = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	static String[] dayOfTheWeek = { "sum", "mon", "tue", "wed", "thu", "fri", "sat" };

	private int getFirstSundayOfEveryMonth(String n, String m, HashMap<String, Integer> map) {

		int start = Integer.parseInt(n.substring(0, 4));
		int end = Integer.parseInt(m.substring(0, 4));

		int result = 0;

		for (int i = start; i <= end; i++) {
			String temp = Integer.toString(i) + n.substring(4, n.length());
			result += getFirstSundayOfMonth(temp, m, getDayOfTheWeekByYear(temp, map));

		}

		return result;
	}

	private int getFirstSundayOfMonth(String n, String m, int dayOfWeek) {

		int count = (dayOfWeek == 0) ? 1 : 0;
		int temp = 0;
		int diff = 0;

		for (int i = 0; i < 11; i++) {
			if (i == 1 && isLeapYears(Integer.parseInt(n.substring(0, 4))))
				temp += 1;

			temp += months[i];
			diff = temp % 7 + dayOfWeek;

			if (diff > 6) {
				while (true) {
					diff -= 7;

					if (diff < 7)
						break;

				}
			}

			if (diff == 0)
				count++;

		}

		return count;

	}

	private int getDayOfTheWeekByYear(String n, HashMap<String, Integer> map) {

		int standard = 1900;
		int days = 365;
		int temp = 0;

		for (int i = standard; i < Integer.parseInt(n.substring(0, 4)); i++)
			temp += (isLeapYears(i)) ? days + 1 : days;

		temp = map.get("19000101") + (temp % 7);

		return (temp == 7) ? 0 : temp;

	}


	private boolean isLeapYears(int n) {

		if (n % 4 == 0) {
			if (n % 100 == 0)
				return false;

			if (n % 400 == 0)
				return true;

			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("19000101", 1);

		GetFirstSundayOfEveryMonth getSunday = new GetFirstSundayOfEveryMonth();

		System.out.println("result: " + getSunday.getFirstSundayOfEveryMonth("19010101", "20001231", map));

	}

}
