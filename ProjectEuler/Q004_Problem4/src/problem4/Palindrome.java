package problem4;

public class Palindrome {

	private boolean isPalindrome(int n) {
		String str = Integer.toString(n);

		for (int i = 0; i < str.length() / 2 + 1; i++) {
			if (str.charAt(i) == str.charAt(str.length() - 1 - i))
				continue;
			else
				return false;
		}

		return true;
	}

	private int maxOfPalindrome(int n) {
		StringBuilder str = new StringBuilder();

		for (int i = 0; i < n; i++)
			str.append("9");

		int x = Integer.parseInt(str.toString());
		int y = x;
		int result = 0;

		for (int i = 0; i < x; i++) 
			for (int j = 0; j < y; j++) {
				int temp = (x - i) * (y - j);

				if (isPalindrome(temp))
					result = (temp > result) ? temp : result;
			}


		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Palindrome pd = new Palindrome();

		System.out.println(pd.maxOfPalindrome(3));
	}

}
