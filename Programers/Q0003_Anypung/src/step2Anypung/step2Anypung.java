package step2Anypung;

public class step2Anypung {

	public static void main(String[] args) {

		int[][] array = { { 1, 4, 2, 4, 1 }, { 2, 1, 2, 1, 3 }, { 2, 2, 3, 4, 1 }, { 4, 1, 4, 1, 3 },
				{ 2, 4, 3, 4, 1 } };
		int[][] array2 = { { 2, 4, 1, 2, 1 }, { 3, 3, 2, 3, 3 }, { 2, 4, 1, 2, 2 }, { 4, 2, 4, 1, 1 },
				{ 4, 2, 3, 3, 2 } };
		int[][] array3 = { { 1, 4, 1, 2, 1 }, { 2, 1, 2, 4, 3 }, { 2, 3, 3, 4, 2 }, { 4, 1, 4, 1, 3 },
				{ 2, 4, 1, 2, 1 } };

		step2Anypung upgradedAnypung = new step2Anypung();

		upgradedAnypung.anypung(array);
		
		upgradedAnypung.anypung(array2);
		
		upgradedAnypung.anypung(array3);
	}

	private void anypung(int[][] array) {

		printArr(array);

		int count = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array.length; j++) {

				int[] result = subAnypung(lengthSwap(array, i, j - 1, j));

				if (result != null) {
					System.out.println("- x: " + result[0] + ", y: " + result[1]);
					count++;
					printArr(array);
				}

				array = lengthSwap(array, i, j, j - 1);

				int[] result2 = subAnypung(widthSwap(array, i, j - 1, j));

				if (result2 != null) {
					System.out.println("| x: " + result2[0] + ", y: " + result2[1]);
					count++;
					printArr(array);
				}

				array = widthSwap(array, i, j, j - 1);

			}
		}
		System.out.println("count: " + count);
	}

	private int[][] lengthSwap(int[][] array, int x, int y, int z) {
		int temp = array[x][y];
		array[x][y] = array[x][z];
		array[x][z] = temp;

		return array;
	}

	private int[][] widthSwap(int[][] array, int x, int y, int z) {
		int temp = array[y][x];
		array[y][x] = array[z][x];
		array[z][x] = temp;

		return array;
	}

	private int[] subAnypung(int[][] inArray) {

		for (int i = 0; i < 5; i++) {
			int result[] = hasSameTile(inArray, i, 0);
			int result2[] = hasSameTile(inArray, i, 1);

			if (isSameTile(result))
				return new int[] { i, result[0] };

			if (isSameTile(result2))
				return new int[] { i, result2[0] };

		}
		return null;
	}

	private boolean isSameTile(int[] result) {
		if (result == null || result[1] == 0)
			return false;

		return true;
	}

	private int[] hasSameTile(int[][] inArray, int rowNumber, int flag) {
		int initNumber = (flag == 0) ? inArray[rowNumber][0] : inArray[0][rowNumber];
		int tempNumber = 0;
		int count = 1;
		int index = 0;

		for (int i = 1; i < 5; i++) {
			tempNumber = (flag == 0) ? inArray[rowNumber][i] : inArray[i][rowNumber];

			if (initNumber != tempNumber && count < 3) {
				initNumber = tempNumber;
				count = 1;
			} else if (initNumber == tempNumber) {
				if (count == 1)
					index = i - 1;
				count++;
			}

			if (count >= 3 && (i == 4 || initNumber != tempNumber))
				return new int[] { index, count };
		}

		return null;
	}

	private void printArr(int[][] array) {
		for (int[] eleArr : array) {
			for (int ele : eleArr) {
				System.out.print(ele);
				System.out.print(" ");
			}
			System.out.println();

		}
		System.out.println();
	}

}
