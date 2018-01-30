package expressionsOfNumber;

public class ExpressionsOfNumber {

	private int expressions(int num) {

		int count = 1;
		int length = (num / 2 + 2);

		if (num <= 2)
			return 1;

		for (int i = 1; i < length; i++) {
			int temp = 0;
			for (int j = i; j < length; j++) {
				temp += j;

				if (temp == num)
					count++;
			}
		}

		return count;
	}

	public int expressions2(int num) {
		int answer = 0;
		for (int i = 1; i <= num; i += 2) {
			if (num % i == 0) {
				answer++;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExpressionsOfNumber eon = new ExpressionsOfNumber();

		System.out.println(eon.expressions(5));
		System.out.println(eon.expressions(6));
		System.out.println(eon.expressions2(9));
		System.out.println(eon.expressions(10));
		System.out.println(eon.expressions(14));
		System.out.println(eon.expressions(15));
		System.out.println();
		
		System.out.println(eon.expressions2(5));
		System.out.println(eon.expressions2(6));
		System.out.println(eon.expressions2(9));
		System.out.println(eon.expressions2(10));
		System.out.println(eon.expressions2(14));
		System.out.println(eon.expressions2(15));

	}

}
