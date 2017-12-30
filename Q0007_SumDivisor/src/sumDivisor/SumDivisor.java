package sumDivisor;

public class SumDivisor {

	private int sumDivisor(int n) {
		int answer = 0;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				answer += i;
		}

		return answer;
	}

	public int sumDivisor2(int num) {
		return java.util.stream.IntStream.rangeClosed(1, num)
											.filter(x -> num % x == 0)
											.sum();
	}

	public int sumDivisor3(int num) {
		int answer = 0;

		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				answer += i;
			}
		}
		return answer + num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SumDivisor sumDivisor = new SumDivisor();

		System.out.println(sumDivisor.sumDivisor(12));
		System.out.println(sumDivisor.sumDivisor2(12));
		System.out.println(sumDivisor.sumDivisor3(12));

	}

}
