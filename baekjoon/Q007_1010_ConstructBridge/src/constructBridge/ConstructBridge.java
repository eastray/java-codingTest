package constructBridge;

import java.util.Scanner;

public class ConstructBridge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructBridge cd = new ConstructBridge();
		Scanner sc = new Scanner(System.in);

		System.out.println(cd.constructBridge(2, 2));
		System.out.println(cd.constructBridge(2, 4));
		System.out.println(cd.constructBridge(1, 5));
		System.out.println();
		System.out.println(cd.constructBridge(1, 3));
		System.out.println(cd.constructBridge(3, 5));
		System.out.println(cd.constructBridge(13, 29));

	}

	public long constructBridge(int n, int m) {
		// TODO Auto-generated method stub
		long sum = 0;

		if (m < n)
			return 0;

		if (m == n)
			return 1;

		for (int i = 0; i < m; i++)
			sum += i;

		for (int i = 2; i < n; i++) {
			for (int j = i; j <= m; j++) {
				sum += j - i;
			}
		}// todo
		

		return sum;
	}

}
