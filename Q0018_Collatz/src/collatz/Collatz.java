package collatz;

public class Collatz {
	int count = 0;
	int limited = 500;

	private int collatz (int num) {
		if (num == 1)
			return count;

		if (count == limited)
			return -1;

		count++;

		return collatz((num % 2 == 0) ? num / 2 : num * 3 + 1);

	}

	private int collatz2 (int num) {
		count = 0;
		
		for(int i = 1; i <= limited; i++) {
			
			if(num == 1)
				return count;
			
			count++;
			
			num = (num%2 == 0) ? num/2 : num * 3 + 1;
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Collatz collatz = new Collatz();

		System.out.println(collatz.collatz(6));
		System.out.println(collatz.collatz2(6));

	}

}
