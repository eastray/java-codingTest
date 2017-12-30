package evenOrOdd;

public class EvenOrOdd {

	private String evenOrOdd(int n) {

		return (n % 2 == 0) ? "Even" : "Odd";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EvenOrOdd evenOrOdd = new EvenOrOdd();

		System.out.println(evenOrOdd.evenOrOdd(12));

	}

}

