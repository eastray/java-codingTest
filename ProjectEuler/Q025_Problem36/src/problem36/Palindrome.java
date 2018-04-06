package problem36;

public class Palindrome {

	public boolean isPalindrome(StringBuilder sb) {
		return (!sb.substring(0, sb.length() / 2).equals(sb.reverse().substring(0, sb.length() / 2))) ? true : false;
	}

	public int sumOfPalindrome() {

		int result = 0;

		for (int i = 1; i <= 1000000; i++) {

			if (isPalindrome(new StringBuilder(Integer.toString(i))) || isPalindrome(new StringBuilder(Integer.toBinaryString(i))))
				continue;

			result += i;

		}

		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Palindrome pd = new Palindrome();

		System.out.println(pd.sumOfPalindrome());
		
	}

}
