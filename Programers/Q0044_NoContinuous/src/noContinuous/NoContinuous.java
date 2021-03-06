package noContinuous;

import java.util.ArrayList;
import java.util.Arrays;

public class NoContinuous {

	private int[] noContinuous(String str) {

		int[] intArray = str.chars().toArray();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(Character.getNumericValue(intArray[0]));
		
		for(int i = 1; i < intArray.length; i++)
			if(list.get(list.size()-1) != Character.getNumericValue(intArray[i]))
				list.add(Character.getNumericValue(intArray[i]));
		
		return list.stream().mapToInt(ele -> ele).toArray();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NoContinuous nc = new NoContinuous();

		System.out.println(Arrays.toString(nc.noContinuous("133303")));

	}

}
