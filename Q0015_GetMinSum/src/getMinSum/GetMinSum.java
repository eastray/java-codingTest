package getMinSum;

import java.util.Arrays;

public class GetMinSum {

	private int getMinSum(int[] A, int[] B) {
		int length = A.length - 1;
		int result = 0;

		Arrays.sort(A);
		Arrays.sort(B);

		for (int i = 0; i <= length; i++)
			result += A[i] * B[length - i];

		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GetMinSum getMinSum = new GetMinSum();

		// int[] A = { 1, 2 };
		// int[] B = { 3, 4 };
		int[] A = { 1, 2, 3 };
		int[] B = { 4, 5, 6 };

		System.out.println(getMinSum.getMinSum(A, B));

	}

}
