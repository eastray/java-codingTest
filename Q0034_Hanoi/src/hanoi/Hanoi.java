package hanoi;

import java.util.Arrays;

public class Hanoi {
	public void recursion(int from, int by, int to, int n) {
		System.out.println("-" + "n: " + n + " to: " + from + " wp: " + by + " from: " + to);

		if (n == 1)
			System.out.println("[" + from + ", " + to + "]");

		else {
			recursion(from, to, by, n - 1);

			System.out.println("[" + from + ", " + to + "]");
			recursion(by, from, to, n - 1);
		}
	}

	public int[][] hanoi(int n) {
		// 2차원 배열을 완성해 주세요.
		int[][] answer = null;

		recursion(1, 2, 3, n);

		return answer;
	}

	public static void main(String[] args) {
		Hanoi hanoi = new Hanoi();

		System.out.println(Arrays.toString(hanoi.hanoi(4)));
	}

}
