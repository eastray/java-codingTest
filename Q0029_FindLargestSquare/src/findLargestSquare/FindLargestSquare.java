package findLargestSquare;

public class FindLargestSquare {

	private int findLargestSquare(char[][] board) {
		int[][] intArray = setIntArray(board);

		printArray(intArray);

		return sumArray(intArray);
	}

	private int min(int x, int y, int z) {
		x = x < y ? x : y;
		return x < z ? x : z;
	}

	private int[][] setIntArray(char[][] array) {
		int[][] intArray = new int[array.length][array.length];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i][j] == 'O')
					intArray[i][j] = 1;
			}
		}

		return intArray;
	}

	private int sumArray(int[][] array) {
		int[][] intArray = new int[array.length][array.length];
		int result = 0;

		for (int i = 1; i < array.length; i++) {
			for (int j = 1; j < array.length; j++) {
				if (array[i][j] == 1) {
					intArray[i][j] = min(intArray[i - 1][j - 1], intArray[i - 1][j], intArray[i][j - 1]) + 1;
					result = result > intArray[i][j] ? result : intArray[i][j];
				}
			}
		}

		printArray(intArray);

		return result * result;
	}

	private void printArray(int[][] array) {
		for (int[] ele : array) {
			for (int i : ele)
				System.out.print(i + " ");
			System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args) {
		FindLargestSquare fls = new FindLargestSquare();

		char[][] board = { { 'X', 'O', 'O', 'O', 'X' }, { 'X', 'O', 'O', 'O', 'O' }, { 'X', 'X', 'O', 'O', 'O' },
				{ 'X', 'X', 'O', 'O', 'O' }, { 'X', 'X', 'X', 'X', 'X' } };
		char[][] board2 = { { 'O', 'O', 'X', 'O', 'O' }, { 'X', 'O', 'O', 'O', 'O' }, { 'O', 'X', 'O', 'O', 'O' },
				{ 'O', 'X', 'O', 'O', 'O' }, { 'O', 'X', 'X', 'X', 'X' } };
		char[][] board3 = { 
				{ 'O', 'O', 'X', 'O', 'O', 'O', 'O', 'X', 'O', 'O' },
				{ 'X', 'O', 'O', 'O', 'O', 'O', 'O', 'X', 'O', 'O' },
				{ 'O', 'X', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O' },
				{ 'O', 'X', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O' },
				{ 'O', 'X', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O' },
				{ 'O', 'X', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O' },
				{ 'O', 'X', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O' },
				{ 'O', 'X', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O' },
				{ 'O', 'X', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O' },
				{ 'O', 'X', 'X', 'X', 'X', 'O', 'O', 'X', 'O', 'O' } };

		 System.out.println(fls.findLargestSquare(board));
		 System.out.println(fls.findLargestSquare(board2));
		System.out.println(fls.findLargestSquare(board3));

	}

}
