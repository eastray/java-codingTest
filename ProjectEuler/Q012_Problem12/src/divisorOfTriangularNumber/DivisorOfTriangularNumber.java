package divisorOfTriangularNumber;

import java.util.ArrayList;
import java.util.HashMap;

public class DivisorOfTriangularNumber {

	// 주어진 수를 소인수분해한 다음, 그 소인수들의 제곱인 수에 1을 더하여 곱한 값이 약수의 갯수가 된다.
	private int getDivisorOfTriangularNumber(int n) {

		int triangularNumber = 0;
		int index = 1;
		ArrayList<Integer> list = new ArrayList<Integer>();

		while (true) {
			triangularNumber += index;
			index++;

			int temp = triangularNumber;
			int j = 2;

			while (temp > 1) {
				if (temp % j == 0) {
					temp = temp / j;
					list.add(j);

				} else
					j++;

			}

			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

			for (int i = 0; i < list.size(); i++) {
				if (!map.containsKey(list.get(i)))
					map.put(list.get(i), 2);

				else if (map.containsKey(list.get(i)))
					map.replace(list.get(i), map.get(list.get(i)) + 1);
			}

			int result = map.values().stream().reduce(1, (a, b) -> a * b).intValue();

			if (result >= 500)
				return triangularNumber;

			list.clear();
			map.clear();

		}
		// return n;
		////////////////////////////

		// int triangularNumber = 0;
		// int index = 1;
		// ArrayList<Integer> list = new ArrayList<Integer>();
		//
		// while (true) {
		// triangularNumber += index;
		// System.out.println(triangularNumber);
		// index++;
		//
		// for(int i = 1; i <= triangularNumber; i++){
		// if(triangularNumber % i == 0){
		// list.add(i);
		// }
		//
		// }
		//
		// System.out.println(Arrays.toString(list.stream().mapToInt(m->m).toArray()));
		// System.out.println("count: " + list.stream().map(m->m).count());
		//
		// if (list.stream().map(m->m).count() >= 500)
		// return triangularNumber;
		//
		//// if(index == 20)
		//// break;
		//
		// list.clear();
		// }

		// return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DivisorOfTriangularNumber dotn = new DivisorOfTriangularNumber();

		System.out.println(dotn.getDivisorOfTriangularNumber(5));
	}

}
