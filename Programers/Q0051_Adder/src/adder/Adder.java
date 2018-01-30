package adder;

public class Adder {

	public int adder(int a, int b) {

		if (a == b)
			return a;

		if (a > b) {
			return a + adder(b, a - 1);
		}

		return b + adder(a, b - 1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Adder adder = new Adder();

		System.out.println(adder.adder(3, 5));

	}

}
