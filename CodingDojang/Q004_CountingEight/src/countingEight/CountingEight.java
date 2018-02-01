package countingEight;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class CountingEight {

	private int getEight(int n) {
		int count = 0;

		for (int i = 0; i < n; i++) {
			String str = Integer.toString(i);

			for (int j = 0; j < str.length(); j++)
				if (str.substring(j, j + 1).contains("8"))
					count++;
		}

		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CountingEight ce = new CountingEight();

		System.out.println(ce.getEight(10000));

	}

}
