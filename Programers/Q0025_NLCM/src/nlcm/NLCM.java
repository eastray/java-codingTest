package nlcm;

public class NLCM {

	private long gcd(final long high, final long low) {
		if (low == 0) {
			return high;
		} else {
			return gcd(low, high % low);
		}
	}

	private long nlcm(int[] num) {
		int numLength = num.length;
		long answer = num[0];
		int number = 0;
		long high = 0;
		long low = 0;
		for (int i = 1; i < numLength; i++) {
			number = num[i];
			high = Math.max(answer, number);
			low = Math.min(answer, number);
			answer = high * low / gcd(high, low);
		}
		return answer;
	}

	public static void main(String[] args) {

		NLCM nlcm = new NLCM();

		int[] testcase = { 2, 6, 8, 14 };
		int[] testcase2 = { 66, 86, 27, 6, 30, 35, 46, 94, 70, 85 };
		int[] testcase3 = { 59, 39, 60, 45, 34, 40, 89, 85, 70, 28 };

		System.out.println(nlcm.nlcm(testcase));
		System.out.println(nlcm.nlcm(testcase2));
		System.out.println(nlcm.nlcm(testcase3));
	}

}
