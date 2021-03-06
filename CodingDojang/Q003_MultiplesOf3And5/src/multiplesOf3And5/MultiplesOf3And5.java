package multiplesOf3And5;

import java.util.stream.IntStream;

public class MultiplesOf3And5 {

	private int multiple1(int n, int m) {
		int result = 0;

		for (int i = 1; i < 1000; i++)
			if (i % n == 0 || i % m == 0)
				result += i;

		return result;
	}

	private int multiple2(int n, int m) {

		return IntStream.range(1, 1000).filter(ele -> (ele % n == 0 || ele % m == 0)).sum();

	}

	public static void main(String[] args) {
		MultiplesOf3And5 moa = new MultiplesOf3And5();

		System.out.println("multiple1: " + moa.multiple1(3, 5));
		System.out.println("multiple2: " + moa.multiple2(3, 5));

	}

}
