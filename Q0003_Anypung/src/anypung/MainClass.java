package anypung;

public class MainClass {

	// private static int[][] arr = { { 1, 4, 1, 1, 1 }, { 2, 1, 2, 4, 3 },{2,1,
	// 3, 4, 3 }, { 4, 1, 4, 1, 3 }, { 2, 4, 1, 1, 1 } };
	// private static int[][] arr = { { 1, 4, 2, 4, 1 }, { 2, 1, 2, 4, 3 }, { 2,
	// 1, 3, 4, 3 }, { 4, 1, 4, 1, 3 },{ 2, 4, 3, 4, 1 } };
	private static int[][] arr = { { 2, 4, 1, 2, 1 }, { 3, 4, 2, 3, 3 }, { 2, 4, 1, 2, 2 }, { 4, 4, 4, 1, 2 },
			{ 4, 2, 3, 3, 2 } };

	private static int[][] subArr = new int[5][5];

	public static void main(String[] args) {

		MainClass mc = new MainClass();

		mc.anypung();
	}

	private void anypung() {
		boolean checkChangedFlag = true;
		printArr();

		while (checkChangedFlag) {
			for (int i = 0; i < 5; i++) {
				markArr(i, checkSameTile(i, 0), 0);
				markArr(i, checkSameTile(i, 1), 1);
			}

			checkChangedFlag = removeElement();

			sortArr();
		}

		printArr();
	}

	private int[] checkSameTile(int rowNumber, int flag) {
		int initNumber = (flag == 0) ? arr[rowNumber][0] : arr[0][rowNumber];
		int tempNumber = 0;
		int count = 1;
		int index = 0;

		for (int i = 1; i < 5; i++) {
			tempNumber = (flag == 0) ? arr[rowNumber][i] : arr[i][rowNumber];

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

	private void markArr(int i, int[] scope, int flag) {

		if (scope == null || scope[1] == 0)
			return;

		for (int j = scope[0]; j < scope[0] + scope[1]; j++) {
			if (flag == 1)
				subArr[j][i] = 1;
			else
				subArr[i][j] = 1;
		}
	}

	private boolean removeElement() {
		boolean flag = false;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (subArr[i][j] == 1 && arr[i][j] != 0) {
					flag = true;
					subArr[i][j] = 0;
					arr[i][j] = 0;
				}
			}
		}
		return flag;
	}

	private void sortArr() {
		for (int i = 4; i >= 0; i--) {
			for (int j = 0; j < 5; j++) {
				if (arr[i][j] == 0)
					arr[i][j] = subSortArr(i, j);
			}
		}
	}

	private int subSortArr(int i, int j) {

		if (i == 0 || arr[i][j] != 0) {
			int temp = arr[i][j];
			arr[i][j] = 0;
			return temp;
		}

		return subSortArr(i - 1, j);
	}

	private void printArr() {
		for (int[] eleArr : arr) {
			for (int ele : eleArr) {
				System.out.print(ele);
				System.out.print(" ");
			}
			System.out.println();

		}
		System.out.println();
	}

}