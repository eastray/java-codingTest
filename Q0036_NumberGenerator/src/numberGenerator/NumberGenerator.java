package numberGenerator;

import java.util.Arrays;

public class NumberGenerator {

	public int[] numberGenerator(int x, int n){
		
		int[] result = new int[n];
		
		for(int i = 1; i <= result.length; i++)
			result[i-1] = i * x;
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NumberGenerator ng = new NumberGenerator();

		System.out.println(Arrays.toString(ng.numberGenerator(3, 5)));
		System.out.println(Arrays.toString(ng.numberGenerator(5, 5)));
		System.out.println(Arrays.toString(ng.numberGenerator(10, 5)));
		
		
		
	}

}
