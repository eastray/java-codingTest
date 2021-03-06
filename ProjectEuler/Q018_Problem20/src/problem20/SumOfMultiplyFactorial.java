package problem20;

import java.math.BigInteger;

public class SumOfMultiplyFactorial {

	private long factorial2(long n) {
		long sum = 1;

		for (int i = 0; i < n; i++) {
			sum *= (n - i);
			System.out.println(sum);
		}

		return sum;
	}

	private String factorial(BigInteger n) {
		BigInteger sum = BigInteger.ONE;
		BigInteger i = BigInteger.ZERO;

		// for(; i < n; i++){
		while (true) {

			if (i.compareTo(n) == 0)
				break;

			sum = sum.multiply(n.subtract(i));
			System.out.println(sum);

			i = i.add(BigInteger.ONE);

			// sum *= (n - i);
		}

		return sum.toString();
	}

	private long sum(int n) {

		String str = factorial(BigInteger.valueOf(n));
		long sum = 0;
		int index = 1;

		while (true) {

			if (str.length() == index)
				break;
			
			sum += Integer.parseInt(str.substring(index-1, index));

			index++;

		}

		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SumOfMultiplyFactorial sof = new SumOfMultiplyFactorial();

		System.out.println(sof.sum(100));
	}

}
