package tiling;

import java.util.HashMap;

public class Tiling {

	private int fibo(int n, HashMap<Integer, Integer> dp) {

		if (dp.containsKey(n))
			return dp.get(n);

		if (n < 4)
			return n;
		else {
			int value = (fibo(n - 1, dp) + fibo(n - 2, dp)) % 100000;
			dp.put(n, value);
			return value;
		}
	}

	public int tiling(int n) {
		if (n < 4)
			return n;
		else {
			HashMap<Integer, Integer> dp = new HashMap<Integer, Integer>();

			return fibo(n, dp);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiling tiling = new Tiling();

		for (int i = 0; i <= 500; i++) {
			long st = System.currentTimeMillis() / 1000;

			System.out.println("final " + i + ": " + tiling.tiling(i));

			long et = System.currentTimeMillis() / 1000;

			System.out.println("Elapsed Time: " + (et - st));
		}
	}

}
