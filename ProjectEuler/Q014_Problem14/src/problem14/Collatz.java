package problem14;

import java.util.HashMap;

public class Collatz {

	// n → n / 2 (n이 짝수일 때)
	// n → 3 n + 1 (n이 홀수일 때)
	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

	private int getCountOfCollatz(long n) {
		int count = 1;

		System.out.print(n);

		while (true) {

			if (map.containsKey((int)n)) {
				count += map.get((int)n).intValue() - 1;
				break;
			}

			if (n == 1)
				break;

			n = (n % 2 == 0) ? n / 2 : n * 3 + 1;
			System.out.print(" -> " + n);

			count++;
		}
		System.out.println();

		return count;
	}

	private int getNumberOfProcess(long n) {

		long[] arr = new long[(int) (n + 1)];
		int max = 0;
		int maxNum = 0;

		for (long i = 1; i <= n; i++) {
			arr[(int) i] = getCountOfCollatz(i);
			map.put((int)i, (int) arr[(int)i]);

			if (max < arr[(int) i]) {
				max = (int) arr[(int) i];
				maxNum = (int) i;
			}

		}

		System.out.println("maxNum: " + maxNum);
		System.out.println("max: " + max);
		return maxNum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Collatz collatz = new Collatz();

		long startTime = System.currentTimeMillis();

		System.out.println(collatz.getNumberOfProcess(1000000));

		long endTime = System.currentTimeMillis();
		System.out.println("##  소요시간(초.0f) : " + (endTime - startTime) / 1000.0f + "초");

		// System.out.println(collatz.getCountOfCollatz(1000000));

	}

}
