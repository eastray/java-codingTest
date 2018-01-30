package change124;

public class Change124 {

	private String change124(int n) {
		String result = "";

		if (n == 0)
			return result;

		while (true) {

			int divNum = n / 3;
			int remNum = n % 3;

			n = divNum - (n % 3 == 0 ? 1 : 0);

			result = (remNum == 0 ? 4 : remNum) + result;
			
			if(n < 1)
				break;

		}

		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Change124 change = new Change124();

		System.out.println(change.change124(15));
		System.out.println(change.change124(90));

	}

}
