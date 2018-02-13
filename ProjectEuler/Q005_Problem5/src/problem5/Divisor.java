package problem5;

public class Divisor {

	private int findDivisor(int n) {
		int result = n;
		while (true) {
			
			for (int i = 2; i <= n; i++){
				if (result % i != 0)
					break;
				
				if(i == n)
					return result;
			}

			result++;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Divisor dv = new Divisor();

		System.out.println(dv.findDivisor(5));
		System.out.println(dv.findDivisor(6));
		System.out.println(dv.findDivisor(7));
		System.out.println(dv.findDivisor(8));
		System.out.println(dv.findDivisor(9));
		System.out.println(dv.findDivisor(10));
		System.out.println(dv.findDivisor(11));
		System.out.println(dv.findDivisor(12));
		System.out.println(dv.findDivisor(13));
		System.out.println(dv.findDivisor(14));
		System.out.println(dv.findDivisor(15));
		System.out.println(dv.findDivisor(16));
		System.out.println(dv.findDivisor(17));
		System.out.println(dv.findDivisor(18));
		System.out.println(dv.findDivisor(19));
		System.out.println(dv.findDivisor(20));
	}

}
