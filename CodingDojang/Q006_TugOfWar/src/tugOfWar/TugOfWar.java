package tugOfWar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TugOfWar {

	@SuppressWarnings("rawtypes")
	private ArrayList<ArrayList> setArray(int[] arr) {
		ArrayList<Integer> first = new ArrayList<Integer>();
		ArrayList<Integer> second = new ArrayList<Integer>();

		for (int ele : arr) {
			if (first.isEmpty())
				first.add(ele);
			else if (second.isEmpty())
				second.add(ele);

			else if (first.get(first.size() - 1) > second.get(second.size() - 1))
				second.add(ele);
			else
				first.add(ele);
		}

		if (first.size() > second.size()) {
			second.add(0);
			second = (ArrayList<Integer>) second.stream().sorted().collect(Collectors.toList());
		} else if (first.size() < second.size()) {
			first.add(0);
			first = (ArrayList<Integer>) first.stream().sorted().collect(Collectors.toList());
		}

		ArrayList<ArrayList> list = new ArrayList<ArrayList>();
		list.add(first);
		list.add(second);

		return list;
	}

	@SuppressWarnings("rawtypes")
	private ArrayList<ArrayList> swapArray(ArrayList<Integer> first, ArrayList<Integer> second) {

		int minS = second.stream().mapToInt(m -> m).min().getAsInt();

		for (int i = 0; i < first.size(); i++)
			if (minS < first.get(i)) {
				second.add(first.get(i));
				first.add(minS);
				first.remove(i);
				second.remove(0);
				break;
			}

		ArrayList<ArrayList> list = new ArrayList<ArrayList>();
		list.add(first);
		list.add(second);

		return list;
	}

	@SuppressWarnings("unchecked")
	public int[] tugOfWar(int[] arr) {

		Arrays.sort(arr);

		@SuppressWarnings("rawtypes")
		ArrayList<ArrayList> list = setArray(arr);

		ArrayList<Integer> first = list.get(0);
		ArrayList<Integer> second = list.get(1);

		int diff = Integer.MAX_VALUE;
		int[] result = new int[2];

		for (int j = 0; j < arr.length; j++) {
			int sumF = first.stream().mapToInt(m -> m).sum();
			int sumS = second.stream().mapToInt(m -> m).sum();

			if (diff > Math.abs(sumF - sumS)) {
				diff = Math.abs(sumF - sumS);
				result[0] = sumF;
				result[1] = sumS;
			}

			if (sumF == sumS)
				return new int[] { sumF, sumS };

			if (sumF != sumS) {
				list = swapArray(first, second);

				first = (sumF > sumS) ? list.get(0) : list.get(1);
				second = (sumF > sumS) ? list.get(1) : list.get(0);
			}

			second = (ArrayList<Integer>) second.stream().sorted().collect(Collectors.toList());
			first = (ArrayList<Integer>) first.stream().sorted().collect(Collectors.toList());

		}

		return result;
	}

	public static void main(String[] args) {

		TugOfWar tow = new TugOfWar();

		// @SuppressWarnings("resource")
		// Scanner scanner = new Scanner(System.in);
		// int n = scanner.nextInt();
		// int[] array = new int[n];

		// for (int i = 0; i < n; i++) {
		// array[i] = scanner.nextInt();
		// }
		int[] array = { 45, 55, 70, 60, 50, 75 };

		System.out.println(Arrays.toString(tow.tugOfWar(array)));
		System.out.println(Arrays.toString(tow.tugOfWar(new int[] { 2, 3, 4, 7, 8 })));
		System.out.println(Arrays.toString(tow.tugOfWar(new int[] { 92, 56, 47, 82 })));
		System.out.println(Arrays.toString(tow.tugOfWar(new int[] { 50, 50, 100, 200 })));
		System.out.println(Arrays.toString(tow.tugOfWar(new int[] { 100, 90, 200 })));
		System.out.println(Arrays.toString(tow.tugOfWar(new int[] { 10, 4, 3, 2, 1 })));
		System.out.println();

		System.out.println(Arrays.toString(tow.tugOfWar2(array)));
		System.out.println(Arrays.toString(tow.tugOfWar2(new int[] { 2, 3, 4, 7, 8 })));
		System.out.println(Arrays.toString(tow.tugOfWar2(new int[] { 92, 56, 47, 82 })));
		System.out.println(Arrays.toString(tow.tugOfWar2(new int[] { 50, 50, 100, 200 })));
		System.out.println(Arrays.toString(tow.tugOfWar2(new int[] { 100, 90, 200 })));
		System.out.println(Arrays.toString(tow.tugOfWar2(new int[] { 10, 4, 3, 2, 1 })));

	}

	public int[] tugOfWar2(int[] arr) {

		int[] firstArr = new int[arr.length / 2];
		int[] secondArr = new int[arr.length / 2 + arr.length % 2];
		
		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			if (i < arr.length / 2)
				firstArr[i] = arr[i];
			else
				secondArr[i - arr.length / 2] = arr[i];
		}

		int firstArrSum = IntStream.of(firstArr).map(m -> m).sum();
		int secondArrSum = IntStream.of(secondArr).map(m -> m).sum();
		int tmp = 0;

		for (int j = 0; j < firstArr.length; j++) {
			for (int k = 0; k < secondArr.length; k++) {
				if (Math.abs(firstArrSum - secondArrSum) > Math.abs(
						(firstArrSum - firstArr[j] + secondArr[k]) - (secondArrSum - secondArr[k] + firstArr[j]))) {

					tmp = firstArr[j];
					firstArr[j] = secondArr[k];
					secondArr[k] = tmp;

					firstArrSum = IntStream.of(firstArr).map(m -> m).sum();
					secondArrSum = IntStream.of(secondArr).map(m -> m).sum();
				}
			}
		}

		return new int[] { firstArrSum, secondArrSum };
	}

}
