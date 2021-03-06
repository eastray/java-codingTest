package problem2;

public class SumOfFibonacciNumbersUsingLoop {

	private int sumOfFibonacci(int n) {
		int result = 0;
		int before = 0;

		for (int i = 1; i < n;) {
			
			if ((before + i) % 2 == 0)
				result += before + i;

			int temp = before;

			before = i;
			i += temp;
		}

		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SumOfFibonacciNumbersUsingLoop sofnul = new SumOfFibonacciNumbersUsingLoop();

		System.out.println(sofnul.sumOfFibonacci(10));
		System.out.println(sofnul.sumOfFibonacci(4000000));
	}

}
