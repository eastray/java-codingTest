package problem1;

import java.util.stream.IntStream;

public class GetMultipleOfNUsingStream {

	private int getMultiple(int n) {
		return IntStream.range(1, n).filter(m -> (m % 3 == 0 || m % 5 == 0)).sum();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GetMultipleOfNUsingStream gmonus = new GetMultipleOfNUsingStream();

		System.out.println(gmonus.getMultiple(10));
		System.out.println(gmonus.getMultiple(1000));
	}

}
