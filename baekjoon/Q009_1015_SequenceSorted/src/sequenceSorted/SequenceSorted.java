package sequenceSorted;

import java.util.Arrays;
import java.util.Scanner;

public class SequenceSorted {
	
	public String sortedSequence(int[] arr){
		
		int[] subArr = arr.clone();
		int[] result = new int[arr.length];
		
		Arrays.sort(subArr);
		
		for(int i = 0; i < arr.length;i++)
			result[i] = Arrays.binarySearch(subArr, arr[i]);
		
		String str = Arrays.toString(result).replaceAll(",", "");
		str = str.substring(1, str.length()-1);
		
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[] n = {2, 3, 1};
		
		SequenceSorted ss = new SequenceSorted();
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr= new int[n];
		
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
			
		
		System.out.println(ss.sortedSequence(arr));
		
		
	}

}
