package problem10;

public class PrimeNumber {

	private long sumOfPrimeNumber(int n) {
		boolean[] arr = new boolean[n + 1];
		long result = 0;

		arr[0] = true;
		arr[1] = true;

		for (int i = 2; (i * i) <= n; i++) {
			if (arr[i] == false)
				for (int j = i * i; j <= n; j += i)
					arr[j] = true;
		}

		for (int i = 2; i <= n; i++)
			if (arr[i] == false)
				result += i;

		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrimeNumber pn = new PrimeNumber();

		System.out.println(pn.sumOfPrimeNumber(2000000));

	}

}
