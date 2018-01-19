package printReversedTriangle;

public class PrintReversedTriangle {

	private String printReversedTriangle(int n) {

		String str = "";

		if (n == 1)
			return "*";

		for (int i = 0; i < n; i++)
			str += "*";

		return str +"\n" +  printReversedTriangle(n - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrintReversedTriangle prt = new PrintReversedTriangle();

		System.out.println(prt.printReversedTriangle(6));

	}

}
