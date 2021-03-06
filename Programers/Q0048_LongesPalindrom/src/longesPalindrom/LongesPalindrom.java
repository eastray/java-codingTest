package longesPalindrom;

public class LongesPalindrom {

	public int longesPalindrom(String str) {
		int count = 0;
		int result = 0;

		for (int i = 0; i < str.length(); i++) {
			for (int j = str.length() - 1; j >= i; j--) {
				
				if (i == j && str.charAt(i) == str.charAt(j)) {
					count += 1;

					if (result < count)
						result = count;
					
					i -= count / 2;
					count = 0;
					break;
					
				}if (str.charAt(i) == str.charAt(j)) {
					i++;
					count += 2;
					
					if (result < count)
						result = count;

				} else if (str.charAt(i) != str.charAt(j) && count > 0) {
					i -= count / 2;
					count = 0;

				}
				
				
			}
			count=0;
		}

		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LongesPalindrom lp = new LongesPalindrom();

		System.out.println(lp.longesPalindrom("abcba"));
		System.out.println(lp.longesPalindrom("abcbaddef"));
		System.out.println(lp.longesPalindrom("abcbaddaf"));
		System.out.println(lp.longesPalindrom("bbabcbaddaf"));
		System.out.println(lp.longesPalindrom("aaabcbaaddaf"));
		System.out.println(lp.longesPalindrom("aaabcbggggggggggaaddaf"));
		System.out.println(lp.longesPalindrom("gggggggggg"));
		System.out.println(lp.longesPalindrom("ggg"));
		System.out.println(lp.longesPalindrom("gggg"));
	}

}
