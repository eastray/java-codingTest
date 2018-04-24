package printSwirl;

import java.util.Scanner;

public class PrintSwirl {

	public void printSwirl(int x, int y, int n, int m) {

		int max = Math.max(Math.max(Math.abs(x), Math.abs(y)), Math.max(Math.abs(n), Math.abs(m)));

		int[][] arr = createMatrix(max);

		int size = max * 2 + 1;
		int mid = size / 2;

		for (int j = x; j <= n; j++) {
			for (int i = y; i <= m; i++)
				System.out.print(arr[mid + j][mid + i] + "	"
						+ "");
			System.out.println();

		}

	}

	private int[][] createMatrix(int max) {

		int size = max * 2 + 1;
		int[][] arr = new int[size][size];
		int count = (int) Math.pow(size, 2);
		int x = size - 1;
		int y = size - 1;

		arr[x][y] = count;
		count--;

		while (count != 0) {
			while (y > 0 && arr[x][y - 1] == 0) {
				y--;
				arr[x][y] = count;
				count--;
			}
			while (x > 0 && arr[x - 1][y] == 0) {
				x--;
				arr[x][y] = count;
				count--;
			}
			while (y < arr[x].length - 1 && arr[x][y + 1] == 0) {
				y++;
				arr[x][y] = count;
				count--;
			}
			while (x < arr.length - 1 && arr[x + 1][y] == 0) {
				x++;
				arr[x][y] = count;
				count--;
			}

			if (count == 0)
				break;
		}

		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		PrintSwirl ps = new PrintSwirl();

		ps.printSwirl(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());

	}

}
