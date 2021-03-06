package strangeSort;

import java.util.Arrays;

public class StrangeSort {

	private String[] strangeSort(String[] strings, int n) {

		for (int i = 0; i < strings.length - 1; i++) {
			for (int j = 1; j < strings.length; j++) {
				if ((int) strings[i].charAt(n) > (int) strings[j].charAt(n)) {
					String temp = strings[i];
					strings[i] = strings[j];
					strings[j] = temp;
				}
			}
		}

		return strings;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StrangeSort ss = new StrangeSort();

		System.out.println(Arrays.toString(ss.strangeSort(new String[] { "car", "let", "zoo" }, 0)));
		System.out.println(Arrays.toString(ss.strangeSort(new String[] { "zoo", "let", "car" }, 1)));
		System.out.println(Arrays.toString(ss.strangeSort(new String[] { "zoo", "let", "car" }, 2)));
	}

}
