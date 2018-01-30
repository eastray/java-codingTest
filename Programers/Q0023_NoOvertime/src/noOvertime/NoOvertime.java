package noOvertime;

import java.util.Arrays;

public class NoOvertime {
	private int noOvertime(int no, int[] works) {

		for (; no >= 1; no--) {
			Arrays.sort(works);
			works[works.length - 1] -= 1;
		}

		return Arrays.stream(works).map(ele -> ele * ele).sum();
	}

	public static void main(String[] args) {
		NoOvertime c = new NoOvertime();
		int[] test = { 4, 3, 3 };
		int[] test2 = { 6, 7, 8, 4, 3, 3, 3 };
		System.out.println(c.noOvertime(4, test));
		System.out.println(c.noOvertime(4, test2));
	}

}
