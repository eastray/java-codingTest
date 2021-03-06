package problem6;

public class SumOfSquaresAndSquares {

	private int sumOfSquares(int n) {
		int result = 0;

		for (int i = 1; i <= n; i++)
			result += Math.pow(i, 2);

		return result;
	}

	private int squareOfSum(int n) {
		int result = 0;

		for (int i = 1; i <= n; i++)
			result += i;

		return (int) Math.pow(result, 2);
	}

	private int sumOfSquaresAndSquares(int n) {

		return squareOfSum(n) - sumOfSquares(n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SumOfSquaresAndSquares sosas = new SumOfSquaresAndSquares();

		System.out.println(sosas.sumOfSquaresAndSquares(10));
		System.out.println(sosas.sumOfSquaresAndSquares(20));
		System.out.println(sosas.sumOfSquaresAndSquares(100));
	}

}
