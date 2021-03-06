package problem25;

import java.math.BigInteger;

public class NthOfFibonacci {

	private int fibo2(int n) {
		if (n <= 2)
			return 1;

		return fibo2(n - 1) + fibo2(n - 2);
	}

	private BigInteger fibo(int n) {

		if (n <= 2)
			return BigInteger.ONE;
		
		BigInteger temp = BigInteger.ONE;
		BigInteger result = BigInteger.ONE;
		BigInteger last = BigInteger.ONE;

		for (int i = 3; i <= n; i++) {
			temp = result;
			result = result.add(last);
			last = temp;
		}

		return result;
	}
	
	private int nthOfFibonacci(int n){
		int result = 0 ;
		int index = 4000;

		while(true){
			
			BigInteger temp = fibo(index);
			
			if(temp.toString().length() >= n){
				result = index;
				break;
			}
			
			index++;
				
			
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NthOfFibonacci nof = new NthOfFibonacci();

		System.out.println(nof.nthOfFibonacci(1000));
	}

}
