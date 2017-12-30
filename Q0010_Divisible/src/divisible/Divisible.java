package divisible;

import java.util.ArrayList;
import java.util.Arrays;

public class Divisible {

	public int[] divisible(int[] array, int divisor) {

		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		for (int i = 0; i < array.length; i++){
			if (array[i] % divisor == 0)
				arrayList.add(array[i]);
		}

		int[] result = new int[arrayList.size()];

		for (int i = 0; i < result.length; i++) 
			result[i] = arrayList.get(i);

		return result;
	}
	
	public int[] divisible2(int[] array, int divisor) {
		
        return Arrays.stream(array).filter(factor -> factor % divisor == 0).toArray();
        
    }

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		Divisible div = new Divisible();
		int[] array = { 5, 9, 7, 10 };
		System.out.println(Arrays.toString(div.divisible(array, 5)));
		System.out.println(Arrays.toString(div.divisible2(array, 5)));
	}

}
