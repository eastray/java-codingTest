package problem3;

public class PrimeDivisorUsingRecursion {

	private int maxOfPrimeDivisors(long n) {
		int i = 2;

		for (; i < n; i++) {
			if (n % i == 0)
				break;

			if (i + 1 == n)
				return (int) n;
		}

		int temp = maxOfPrimeDivisors(n / i);

		return (int) ((temp > n % i) ? temp : n % i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrimeDivisorUsingRecursion pdur = new PrimeDivisorUsingRecursion();

		System.out.println(pdur.maxOfPrimeDivisors(13195));
		System.out.println(pdur.maxOfPrimeDivisors(Long.parseLong("600851475143")));
	}

}
