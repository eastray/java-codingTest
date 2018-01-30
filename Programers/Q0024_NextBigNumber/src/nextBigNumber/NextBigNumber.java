package nextBigNumber;

import java.util.Arrays;

public class NextBigNumber {

	private int nextBigNumber(int n) {
		int count = Integer.bitCount(n);

		while (true) {
			n += 1;

			if (count == Integer.bitCount(n))
				break;
		}

		return n;
	}

	private int getSumOneInBinary(int n) {
		int sum = 0;

		char[] charArray = Integer.toBinaryString(n).toCharArray();

		for (char ele : charArray)
			sum += Character.getNumericValue(ele);

		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NextBigNumber nextBigNumber = new NextBigNumber();

		System.out.println(nextBigNumber.nextBigNumber(78));
		System.out.println(nextBigNumber.nextBigNumber(92));
	}

}
