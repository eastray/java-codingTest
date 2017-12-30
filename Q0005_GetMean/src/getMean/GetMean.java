package getMean;

import java.util.Arrays;

public class GetMean {

	private int getMean(int[] array) {
		int temp = 0;

		for (int ele : array)
			temp += ele;

		return temp / array.length;
	}

	public int getMean2(int[] array) {
		return (int) Arrays.stream(array).average().orElse(0);
	}

	public int getMean3(int[] array) {
		return java.util.stream.IntStream.of(array).sum() / array.length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 1, 3, 5, 6, 7, 8, 9 };

		GetMean getMean = new GetMean();
		System.out.println("Get Average: " + getMean.getMean(array));
		System.out.println("Get Average: " + getMean.getMean2(array));
		System.out.println("Get Average: " + getMean.getMean3(array));

	}

}
