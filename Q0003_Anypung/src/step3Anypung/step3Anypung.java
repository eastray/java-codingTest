package step3Anypung;

public class step3Anypung {
	private static int[][] array = { { 4, 1, 4, 4, 1 }, { 2, 1, 2, 1, 3 }, { 2, 2, 3, 4, 1 }, { 4, 1, 4, 1, 3 },
			{ 2, 4, 3, 4, 1 } };
	// private static int[][] array2 = { { 2, 4, 1, 2, 1 }, { 3, 3, 2, 3, 3 }, {
	// 2, 4, 1, 2, 2 }, { 4, 2, 4, 1, 1 },
	// { 4, 2, 3, 3, 2 } };
	// private static int[][] array3 = { { 1, 4, 1, 2, 1 }, { 2, 1, 2, 4, 3 }, {
	// 2, 3, 3, 4, 2 }, { 4, 1, 4, 1, 3 },
	// { 2, 4, 1, 2, 1 } };

	private static int[][] subArr = new int[5][5];

	public static void main(String[] args) {

		step3Anypung upgradedAnypung = new step3Anypung();

		upgradedAnypung.anypung();

	}

	private void anypung() {

		printArr(array);

		int count = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array.length; j++) {

				int[][] inArray = lengthSwap(array, i, j - 1, j);
				int[] result = subAnypung(inArray);

//				if (result != null) {
//					System.out.println("- x: " + result[0] + ", y: " + result[1]);
//					count++;
//					printArr();
//				}

				// lengthSwap(i, j, j - 1);

				inArray = widthSwap(array, i, j - 1, j);
				int[] result2 = subAnypung(inArray);

//				if (result2 != null) {
//					System.out.println("| x: " + result2[0] + ", y: " + result2[1]);
//					count++;
//					printArr();
//				}

				//widthSwap(i, j, j - 1);

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

	private boolean markArr(int i, int[] scope, int flag) {
		boolean isChangedFlag = false;

		if (scope == null || scope[1] == 0)
			return false;

		for (int j = scope[0]; j < scope[0] + scope[1]; j++) {
			if (flag == 1)
				subArr[j][i] = 1;
			else
				subArr[i][j] = 1;
			isChangedFlag = true;
		}

		return isChangedFlag;
	}

	private int[] subAnypung(int[][] array) {

		boolean[] isChangedFlag = new boolean[2];
		isChangedFlag[0] = isChangedFlag[1] = false;
		boolean temp = true;

		while (temp) {
			for (int i = 0; i < 5; i++) {
				int result[] = hasSameTile(array, i, 0);
				int result2[] = hasSameTile(array, i, 1);

				isChangedFlag[0] = markArr(i, result, 0);
				isChangedFlag[1] = markArr(i, result2, 1);
				
				if(isChangedFlag[0] == false && isChangedFlag[1] == false)
					temp = false;

				if(isChangedFlag[0] == true || isChangedFlag[1] == true){
				array = removeElement(array);

				array = sortArr(array);
				}
			}
			
			printArr(array);
		}

		return null;
	}


	private int[][] removeElement(int[][] array) {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (subArr[i][j] == 1 && array[i][j] != 0) {
					subArr[i][j] = 0;
					array[i][j] = 0;
				}
			}
		}
		return array;
	}

	private int[][] sortArr(int[][] array) {
		for (int i = 4; i >= 0; i--) {
			for (int j = 0; j < 5; j++) {
				if (array[i][j] == 0)
					array[i][j] = subSortArr(i, j);
			}
		}
		
		return array;
	}

	private int subSortArr(int i, int j) {

		if (i == 0 || array[i][j] != 0) {
			int temp = array[i][j];
			array[i][j] = 0;
			return temp;
		}

		return subSortArr(i - 1, j);
	}

	private boolean isSameTile(int[] result) {
		if (result == null || result[1] == 0)
			return false;

		return true;
	}

	private int[] hasSameTile(int[][] array, int rowNumber, int flag) {
		int initNumber = (flag == 0) ? array[rowNumber][0] : array[0][rowNumber];
		int tempNumber = 0;
		int count = 1;
		int index = 0;

		for (int i = 1; i < 5; i++) {
			tempNumber = (flag == 0) ? array[rowNumber][i] : array[i][rowNumber];

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
