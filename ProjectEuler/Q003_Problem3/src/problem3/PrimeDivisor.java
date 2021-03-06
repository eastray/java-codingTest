package problem3;

import java.util.ArrayList;
import java.util.List;

public class PrimeDivisor {

	private List<Integer> findPrimeDivisors(long n) {
		List<Integer> list = new ArrayList<Integer>();

		while (true) {
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					list.add(i);
					n /= i;
				}

				if (i + 1 == n) {
					list.add((int)n);
					n = 0;
				}
			}

			if (n == 0)
				break;
		}

		return list;
	}

	private int maxOfPrimeDivisor(long n) {
		return findPrimeDivisors(n).stream().mapToInt(m -> m).max().getAsInt();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrimeDivisor pd = new PrimeDivisor();

		System.out.println(pd.maxOfPrimeDivisor(13195));
		System.out.println(pd.maxOfPrimeDivisor(Long.parseLong("600851475143")));
	}

}
