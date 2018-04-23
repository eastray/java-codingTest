package treasure;

import java.util.Arrays;
import java.util.Scanner;

public class Treasure {

	public int minTreasure(int[] a, int[] b) {

		int result = 0;

		Arrays.sort(a);

		int[] sequence = new int[a.length];
		int[] sub = b.clone();
		
		Arrays.sort(sub);

		for (int i = 0; i < b.length; i++)
			sequence[i] = Arrays.binarySearch(sub, b[i]);

		for (int i = 0; i < b.length; i++)
			result += b[i] * a[(b.length - 1) - sequence[i]];

		return result;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Treasure tr = new Treasure();

		int n = sc.nextInt();

		int[] a = new int[n];
		int[] b = new int[n];

		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();

		for (int i = 0; i < n; i++)
			b[i] = sc.nextInt();

		System.out.println(tr.minTreasure(a, b));

	}

}

