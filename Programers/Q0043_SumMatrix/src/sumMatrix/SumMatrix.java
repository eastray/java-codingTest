package sumMatrix;

import java.util.Arrays;

public class SumMatrix {

	private int[][] sumMatrix(int[][] fArray, int[][] sArray) {

		if (fArray.length != sArray.length)
			return null;

		for (int i = 0; i < fArray.length; i++) {
			if(fArray[i].length != sArray.length)
				return null;
			
			for (int j = 0; j < fArray[i].length; j++) 
				sArray[i][j] += fArray[i][j];
		}

		return sArray;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SumMatrix sm = new SumMatrix();

		int[][] A = { { 1, 2 }, { 2, 3 } };

		int[][] B = { { 3, 4 }, { 5, 6 } };

		int[][] answer = sm.sumMatrix(A, B);

		if (answer[0][0] == 4 && answer[0][1] == 6 && answer[1][0] == 7 && answer[1][1] == 9) {
			System.out.println("맞았습니다. 제출을 눌러 보세요");
		} else {
			System.out.println("틀렸습니다. 수정하는게 좋겠어요");
		}

	}

}
