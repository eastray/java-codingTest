package problem2;

public class SumOfFibonacciNumbersUsingRecursion {

	private int sumOfFibonacci(int n, int s, int e) {

		int temp = s;

		if (s % 2 != 0)
			s = 0;

		if (e > n)
			return s;

		return s + sumOfFibonacci(n, e, temp + e);
	}

	private int sumOfFibonacci(int n) {
		return sumOfFibonacci(n, 1, 2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SumOfFibonacciNumbersUsingRecursion sofn = new SumOfFibonacciNumbersUsingRecursion();

		System.out.println(sofn.sumOfFibonacci(10));
		System.out.println(sofn.sumOfFibonacci(4000000));
	}

}
