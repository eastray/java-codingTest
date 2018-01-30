package printTriangle;

public class PrintTriangle {

	private String printTriangle(int num) {
		String temp = "";

		if (num == 1)
			return "*\n";

		for (int i = 0; i < num; i++)
			temp += "*";

		return printTriangle(num - 1) + temp + "\n";
	}

	public String printTriangle2(int num) {
		String result = "";
		String stars = "*";
		for (int i = 0; i < num; ++i) {
			result += stars + "\n";
			stars += "*";
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrintTriangle pt = new PrintTriangle();

		System.out.println(pt.printTriangle(5));
		System.out.println(pt.printTriangle2(5));
	}

}
