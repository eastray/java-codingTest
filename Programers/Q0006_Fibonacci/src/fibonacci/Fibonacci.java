package fibonacci;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fibonacci fibo = new Fibonacci();

		int testCase = 40;

		System.out.println(fibo.fibonacci(testCase));

	}

	private int fibonacci(int testCase) {

		if (testCase <= 1)
			return testCase;

		else return fibonacci(testCase - 1) + fibonacci(testCase - 2);
	}

}
