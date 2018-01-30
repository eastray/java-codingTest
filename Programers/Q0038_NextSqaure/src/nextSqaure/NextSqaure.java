package nextSqaure;

public class NextSqaure {

	private int nextSqaure(int n) {

		return (Math.pow((int) Math.sqrt(n), 2) != n) ? -1 : (int) Math.pow((int) Math.sqrt(n) + 1, 2);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NextSqaure ns = new NextSqaure();

		System.out.println(ns.nextSqaure(121));

	}

}
