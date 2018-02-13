package problem9;

public class Pythagoras {

	private int pythagoras(int n) {
		int a = 3;
		int b = 4;
		int c = n - a - b;

		while (true) {

			if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
				System.out.println("Math.pow(a, 2): " + Math.pow(a, 2) + ", Math.pow(b, 2): " + Math.pow(b, 2)
						+ ", Math.pow(c, 2): " + Math.pow(c, 2));
				break;

			} else if (Math.pow(a, 2) + Math.pow(b, 2) < Math.pow(c, 2)) {
				c--;
				b++;
			} else if (Math.pow(a, 2) + Math.pow(b, 2) > Math.pow(c, 2)) {
				a++;
				b = a + 1;
				c = n - a - b;
			}

			System.out.println("a: " + a + ", b: " + b + ", c: " + c);

		}
		return (a * b * c);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pythagoras pytha = new Pythagoras();

		System.out.println("result: " + pytha.pythagoras(1000));
	}

}
