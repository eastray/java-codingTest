package getMiddle;

public class StringExercise {
	String getMiddle(String word) {

		int length = word.length() / 2;
		boolean flag = (word.length() % 2 == 1) ? true : false;

		if (flag)
			return Character.toString(word.charAt(length));

		return (word.charAt(length - 1) + "" + word.charAt(length));
		// return new StringBuilder(new String(word).charAt(length - 1) + "" +
		// new String(word).charAt(length)).toString();
	}

	String getMiddle2(String word) {

		return word.substring((word.length() - 1) / 2, word.length() / 2 + 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringExercise se = new StringExercise();
		System.out.println(se.getMiddle("power"));
		System.out.println(se.getMiddle("abcdef"));
		System.out.println();

		System.out.println(se.getMiddle2("power"));
		System.out.println(se.getMiddle2("abcdef"));
	}

}
