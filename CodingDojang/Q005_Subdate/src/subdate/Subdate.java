package subdate;

public class Subdate {
	// 서력 기원 연수가 4로 나누어떨어지는 해는 윤년으로 한다.(1988년, 1992년, 1996년, 2004년, 2008년, 2012년
	// …)
	// 이 중에서 100으로 나누어떨어지는 해는 평년으로 한다.(1900년, 2100년, 2200년, 2300년, 2500년 …)
	// 그중에 400으로 나누어떨어지는 해는 윤년으로 둔다.(1600년, 2000년, 2400년 …)

	private boolean isLeapYear(int year) {
		if (year % 4 == 0)
			if (year % 100 == 0 && year % 400 != 0)
				return false;

			else
				return true;

		return false;
	}

	private int[] getDateToIntArray(int n) {

		String str = Integer.toString(n);

		if (str.length() != 8)
			return null;

		return new int[] { Integer.parseInt(str.substring(0, 4)), Integer.parseInt(str.substring(4, 6)),
				Integer.parseInt(str.substring(6, str.length())) };
	}

	private int sumYears(int nYear, int mYear) {
		int year = Math.abs(nYear - mYear);
		int minYear = Math.min(nYear, mYear);

		int result = 0;

		for (int i = 0; i < year; i++) {
			if (isLeapYear(minYear + i))
				result += 1;

			result += 365;
		}

		return result;
	}

	private int sumMonthsAndDays(int[] nArray, int[] mArray) {
		int[] months = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int month = Math.abs(mArray[1] - nArray[1]);
		int result = 0;

		if (month > 0) {
			if (Math.abs(month) == 1)
				result += (months[nArray[1]] - nArray[2]) + mArray[2];

			else {
				for (int i = nArray[1] + 1; i < mArray[1]; i++)
					result += months[i];

				result += (months[nArray[1]] - nArray[2]) + mArray[2];
			}

		} else
			result += nArray[2] - mArray[2];

		return result;
	}

	public int subdate(int n, int m) {
		int result = 0;

		int[] nArray = getDateToIntArray(n);
		int[] mArray = getDateToIntArray(m);

		// sum to years, months, days
		result = sumYears(nArray[0], mArray[0]) + sumMonthsAndDays(nArray, mArray);

		return Math.abs(result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Subdate sd = new Subdate();

		System.out.println(sd.subdate(20070505, 20070525));
		System.out.println(sd.subdate(20070405, 20070525));
		System.out.println(sd.subdate(20070305, 20070525));
		System.out.println(sd.subdate(20070515, 20070501));
		System.out.println(sd.subdate(20070501, 20070525));
		System.out.println(sd.subdate(20070301, 20070515));
		System.out.println(sd.subdate(20030303, 20180201));
		System.out.println(sd.subdate(10000101, 19991231));
		System.out.println(sd.subdate(20180101, 20170101));
		System.out.println(sd.subdate(20170101, 20180101));

	}

}
