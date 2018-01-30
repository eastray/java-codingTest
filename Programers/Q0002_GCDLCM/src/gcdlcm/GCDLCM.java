package gcdlcm;

import java.util.Arrays;

public class GCDLCM {

	public int greatestCommonDivisor(int a, int b, int divNum) {

		if (a % divNum == 0 && b % divNum == 0)
			return greatestCommonDivisor(a / divNum, b / divNum, divNum) * divNum;
		else if (a % (divNum + 1) == 0 && b % (divNum + 1) == 0)
			return greatestCommonDivisor(a / (divNum + 1), b / (divNum + 1), divNum) * (divNum + 1);
		else
			return 1;
	}

	public int leastCommonMultiple(int a, int b, int divNum) {

		if (a % divNum == 0 && b % divNum == 0)
			return leastCommonMultiple(a / divNum, b / divNum, divNum) * divNum;
		else if (a % (divNum + 1) == 0 && b % (divNum + 1) == 0)
			return leastCommonMultiple(a / (divNum + 1), b / (divNum + 1), divNum) * (divNum + 1);
		else
			return a * b;
	}

	public int[] gcdlcm(int a, int b) {
		return new int[] { greatestCommonDivisor(a, b, 2), leastCommonMultiple(a, b, 2) };
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GCDLCM c = new GCDLCM();
		System.out.println(Arrays.toString(c.gcdlcm(20, 12)));

		System.out.println(Arrays.toString(c.gcdlcm2(20, 12)));
	}

	public int[] gcdlcm2(int a, int b) {
		int[] answer = new int[2];

		answer[0] = gcd(a, b);
		answer[1] = (a * b) / answer[0];

		return answer;
	}

	private int gcd(int p, int q) {

		if (q == 0)
			return p;

		return gcd(q, p % q);
	}

}
