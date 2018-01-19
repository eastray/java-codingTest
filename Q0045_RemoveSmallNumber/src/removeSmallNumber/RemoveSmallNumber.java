package removeSmallNumber;

import java.util.Arrays;

public class RemoveSmallNumber {

	private int[] removeSmallNumber(int[] array) {

		return Arrays.stream(array).filter(ele -> ele != Arrays.stream(array).min().getAsInt()).toArray();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RemoveSmallNumber rsn = new RemoveSmallNumber();

		System.out.println(Arrays.toString(rsn.removeSmallNumber(new int[] { 4, 3, 2, 1 })));
	}

}