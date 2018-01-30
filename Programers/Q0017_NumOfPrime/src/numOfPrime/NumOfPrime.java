package numOfPrime;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class NumOfPrime {

	private int numOfPrime(int n) {

		int count = 0;

		for (int i = 1; i <= n; i++) {
			int result = 0;

			for (int j = 1; j <= i; j++)
				result += (i % j == 0) ? 1 : 0;

			if (result == 2)
			{
				count++;
				System.out.println(i);
			}

		}

		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NumOfPrime numOfPrime = new NumOfPrime();

		// System.out.println(numOfPrime.numOfPrime(new
		// Scanner(System.in).nextInt()));
		System.out.println(numOfPrime.numOfPrime(59));
	}

}
