package fourBoxes;

public class FourBoxes {

	public int fourBoxes(int[][] arr) {

		int[][] boxes = new int[10][10];

		for (int[] ele : arr)
			for (int i = ele[1]; i < ele[3]; i++)
				for (int j = ele[0]; j < ele[2]; j++)
					boxes[i][j] = 1;

		int result = 0;

		for (int[] elements : boxes)
			for (int ele : elements)
				if (ele == 1)
					result++;

		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FourBoxes fb = new FourBoxes();

		System.out
				.println(fb.fourBoxes(new int[][] { { 1, 2, 4, 4 }, { 2, 3, 5, 7 }, { 3, 1, 6, 5 }, { 7, 3, 8, 6 } }));

	}

}
