package problem28;

import java.math.BigInteger;

public class SumOfDiagonal {

	public BigInteger sumOfDigonal(int n) {
		
		int start = (n % 2 == 0)? 0 : 1;
		int index = (n % 2 == 0)? 1 : 2;
		BigInteger sum = BigInteger.ONE;
		
		while(n > index){
			for(int i = 0; i < 4; i ++){
				start += index;
				sum = sum.add(BigInteger.valueOf(start));
				
			}
			
			index += 2;
			
		}

		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SumOfDiagonal sod = new SumOfDiagonal();

		System.out.println(sod.sumOfDigonal(1001));
	}

}
