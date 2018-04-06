package distributedComputing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 1: 1
// 2: 2, 4, 8. 6
// 3: 3, 9, 7, 1
// 4: 4, 6
// 5: 5
// 6: 6
// 7: 7, 9, 3, 1
// 8: 8, 4, 2, 6
// 9: 9, 1

// 11: 1
// 12: 2, 4, 8, 6
// 13: 3, 9, 7, 1
// 14: 4, 6

public class DistributedComputing {

	public int distributed(int n, int m) {

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i <= 4; i++) {
			int temp = (int) Math.pow(n, i);

			if (list.contains(temp % 10))
				break;

			list.add(temp % 10);
		}

		int remainder = m % list.size();

		return (remainder != 0) ? list.get(remainder - 1) : list.get(list.size() - 1);

	}

	public static void main(String[] args) {

		DistributedComputing dc = new DistributedComputing();

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		System.out.println();

		for (int i = 0; i < n; i++) {
			System.out.println(dc.distributed(sc.nextInt(), sc.nextInt()));

		}

	}

}
