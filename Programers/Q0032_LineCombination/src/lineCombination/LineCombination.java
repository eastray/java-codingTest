package lineCombination;

import java.util.ArrayList;
import java.util.Arrays;

public class LineCombination {

	private ArrayList<Integer> setList(int n) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i <= n; i++)
			list.add(i);

		return list;
	}

	public int[] setAlign(int n, long k) {

		int[] answer = new int[n];

		long index = k - 1;

		ArrayList<Integer> list = setList(n);

		for (int i = 0; i < n; i++) {

			if (index == 0) {
				answer[i] = list.get(0);
				list.remove(0);
				continue;
				
			}

			long ways = factorial(n - i - 1);

			long num = index / ways;
			answer[i] = list.get((int) num);

			list.remove((int) num);
			index = index % ways;

		}

		return answer;
	}

	public long factorial(int n) {
		long result = 1;

		for (int i = 1; i <= n; i++)
			result *= i;

		return result;
	}

//	private int[] setArray(int n) {
//		int[] array = new int[n];
//
//		for (int i = 1; i <= n; i++)
//			array[i - 1] = i;
//
//		return array;
//	}
//
//	public int factorial(int n) {
//		int result = 1;
//
//		for (int i = n; i >= 1; i--)
//			result *= i;
//
//		return result;
//	}
//
//	private void printArray(int[] array, int target) {
//
//		for (int i = 0; i < target; i++)
//			System.out.print(array[i] + " ");
//
//		System.out.println();
//	}
//
//	private void combi(int[] array, int index, int n, int r, int target) {
//
//		if (r == 0)
//			printArray(array, target);
//		
//		else if (n == target)
//			return;
//		
//		else {
//			array[index] = target;
//			combi(array, index + 1, n, r - 1, target + 1);
//			combi(array, index, n, r, target + 1);
//			
//		}
//	}
//
//	private int[] setAlign(int n, int k) {
//		int[] array = setArray(n);
//
//		int f = factorial(n - 1);
//
//		combi(array, 0, 5, 3, 0);
//		
//		return null;
//	}

	public static void main(String[] args) {
		LineCombination lc = new LineCombination();

		System.out.println(Arrays.toString(lc.setAlign(3, 5)));
		System.out.println(Arrays.toString(lc.setAlign(5, 25)));

	}

}
