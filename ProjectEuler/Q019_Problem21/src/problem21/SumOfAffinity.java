package problem21;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.IntStream;

public class SumOfAffinity {

	private boolean isOfDivisor(int target, int n) {

		if (target == 1)
			return true;

		if (n % target == 0)
			return true;

		return false;
	}

	private int[] getOfDivisor(int n) {

		return IntStream.range(1, n).filter(i -> isOfDivisor(i, n)).toArray();
	}

	private boolean isAffinity(int a, int b) {

		int temp = Arrays.stream(getOfDivisor(b)).sum();

		return (a == temp) ? true : false;
	}

	private long sumOfAffinity(int n) {

		HashSet<Integer> set = new HashSet<Integer>();

		for (int i = 2; i <= n; i++) {
			int temp = Arrays.stream(getOfDivisor(i)).sum();

			if (i != temp && isAffinity(i, temp) && !set.contains(temp)) {
				set.add(i);
				set.add(temp);

				System.out.println("Affinity Number is " + i + " and " + temp);
			}
		}

		return Arrays.stream(set.toArray()).mapToInt(m -> (int) m).sum();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SumOfAffinity soa = new SumOfAffinity();

		long start = System.currentTimeMillis();

		System.out.println(soa.sumOfAffinity(10000));

		long end = System.currentTimeMillis();

		System.out.println("실행 시간 : " + (end - start) / 1000.0);

	}

}
