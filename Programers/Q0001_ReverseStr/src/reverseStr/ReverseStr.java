package reverseStr;

import java.util.Arrays;

public class ReverseStr {

	public void quickSort(int[] data, int l, int r) {
		int left = l;
		int right = r;
		int pivot = data[(l + r) / 2];

		do {
			while (data[left] < pivot)
				left++;
			while (data[right] > pivot)
				right--;
			if (left <= right) {
				int temp = data[left];
				data[left] = data[right];
				data[right] = temp;
				left++;
				right--;
			}
		} while (left <= right);

		if (l < right)
			quickSort(data, l, right);
		if (r > left)
			quickSort(data, left, r);
	}

	public String reverseStr(String str) {

		int[] intArr = new int[str.length()];
		String result = "";

		for (int i = 0; i < str.length(); i++)
			intArr[i] = (int) str.charAt(i);

		quickSort(intArr, 0, intArr.length - 1);

		for (int i = intArr.length - 1; i >= 0; i--)
			result += (char) intArr[i];

		return result;
	}

	public String reverseStr2(String str) {
		char[] sol = str.toCharArray();
		Arrays.sort(sol);
		return new StringBuilder(new String(sol)).reverse().toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseStr rs = new ReverseStr();
		System.out.println(rs.reverseStr("Zbcdefg"));
		System.out.println(rs.reverseStr2("Zbcdefg"));
	}

}
