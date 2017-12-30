package getMinMaxString;

import java.util.Arrays;

public class GetMinMaxString {

	private String getMinMaxString(String str) {

		String[] strArr = str.split(" ");
		int[] intArr = new int[strArr.length];

		for (int i = 0; i < strArr.length; i++)
			intArr[i] = Integer.parseInt(strArr[i]);

		Arrays.sort(intArr);

		return intArr[0] + " " + intArr[intArr.length - 1];

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GetMinMaxString getMinMaxString = new GetMinMaxString();

		System.out.println(getMinMaxString.getMinMaxString("1 2 3 4"));
		System.out.println(getMinMaxString.getMinMaxString("-1 -2 -3 -4"));

	}

}
