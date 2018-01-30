package harshadNumber;

import java.util.stream.IntStream;

public class HarshadNumber {

	public boolean isHarshad(int num) {
		
		IntStream temp = Integer.toString(num).chars();
		System.out.println(temp.toArray()[0] );

		return num % (denomi(num, (int) Math.log10(num))) == 0;

	}

	public int denomi(int num, int length) {
		int denominator = 0;

		for (int i = 0; i <= length; i++) {
			denominator += num % 10;
			num = num / 10;
		}

		return denominator;
	}

	private int sum = 0;
	public boolean isHarshad2(int num) {
		sum = 0;
		
		Integer.toString(num).chars().forEach(c -> sum += c - '0');
		
		return num % sum == 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HarshadNumber harshad = new HarshadNumber();

		System.out.println(harshad.isHarshad(20));
		System.out.println(harshad.isHarshad(11));
		System.out.println(harshad.isHarshad(12));
		System.out.println(harshad.isHarshad(13));
		System.out.println(harshad.isHarshad(15));
		System.out.println(harshad.isHarshad(18));
		System.out.println(harshad.isHarshad(135));

	}

}
