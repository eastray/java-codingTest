package bestSet;

import java.util.Arrays;

public class BestSet {

	public int[] bestSet(int n, int s) {
		int[] result = new int[n];
		int length = n;
		
		if(s < n)
			return new int[]{-1};

		for (int i = 0; i < length; i++) {

			if (n == 1) {
				result[i] = s;
				break;
			}

			result[i] = s / n;

			s -= result[i];
			n--;

		}

		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BestSet bestSet = new BestSet();

		System.out.println(Arrays.toString(bestSet.bestSet(3, 13)));

	}

}
