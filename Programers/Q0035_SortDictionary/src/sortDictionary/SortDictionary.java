package sortDictionary;

import java.util.ArrayList;
import java.util.Arrays;

public class SortDictionary {

	public Object[] sortDictionary(String str) {
		StringBuilder sb = new StringBuilder(str).delete(0, 1).delete(str.length() - 2, str.length() - 1);

		String[] st = sb.toString().replaceAll("'","").replaceAll(" ", "").split(",");

		ArrayList<String> list = new ArrayList<String>();
		
		for(String ele : st){
			String[] temp = ele.split(":");
			list.add(temp[0]);
			list.add(temp[1]);
		}
		
		return list.toArray();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SortDictionary sd = new SortDictionary();

		System.out.println(Arrays.toString(sd.sortDictionary("{'fernando': 87, 'chiwoo': 88, 'Mr.kim': 90}")));

	}

}
