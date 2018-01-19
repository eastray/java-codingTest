package hopscotch;

public class Hopscotch {
	private int hopscotch(int[][] board, int size) {
		int result = 0;
		int index = 0;

		for (int i = 0; i < board.length; i++) {

			int number = getMaxNumberOfArray(board[i], index);

			index = getIndexOfArray(board[i], number);
	
			result += number;
		}

		return result;
	}
	
	private int getMaxNumberOfArray(int[] arr, int index) {
		int number = 0;

		for (int i = 0; i < arr.length; i++) {
			if (index != i && number < arr[i]){
				number = arr[i];
			}
				
		}

		return number;
	}

	private int getIndexOfArray(int[] arr, int temp) {

		for (int j = 0; j < arr.length; j++) {
			if (arr[j] == temp)
				return j;
		}

		return -1;

	}

	int hopscotch2(int[][] board, int size) {
		
		return hopscotch2(board, size, 0, -1);
		
	}

	private int hopscotch2(int[][] board, int size, int y, int idx) {
		if (y >= size)
			return 0;
		
		int answer = Integer.MIN_VALUE;
		
		for (int i = 0; i < 4; i++) {
			if (i != idx) 
				answer = Math.max(hopscotch2(board, size, y + 1, i) + board[y][i], answer);
		
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Hopscotch c = new Hopscotch();

		int[][] test = { { 1, 2, 3, 5 }, { 5, 6, 7, 8 }, { 4, 3, 2, 1 } };
		int[][] test2 = { { 3, 2, 2, 9 }, { 2, 1, 3, 10 }, { 1, 8, 1, 8 }, { 5, 3, 7, 5 }, { 3, 2, 5, 9 },
				{ 4, 5, 7, 10 }, { 10, 3, 10, 6 }, { 8, 5, 9, 8 }, { 2, 3, 10, 9 }, { 8, 7, 10, 9 } };
		int[][] test3 = { { 3, 10, 1, 2 }, { 7, 5, 1, 7 }, { 2, 3, 5, 4 }, { 7, 8, 9, 2 }, { 10, 7, 2, 4 },
				{ 9, 3, 8, 5 }, { 9, 7, 3, 4 }, { 6, 5, 5, 10 }, { 6, 4, 3, 5 }, { 7, 4, 10, 3 } };

		System.out.println(c.hopscotch(test, 3));
		System.out.println(c.hopscotch(test2, 10));
		System.out.println(c.hopscotch(test3, 10));
		System.out.println();
		
		System.out.println(c.hopscotch(test, 3));
		System.out.println(c.hopscotch2(test2, 10));
		System.out.println(c.hopscotch2(test3, 10));
	}

}
