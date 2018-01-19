package chooseCity;

public class ChooseCity {

	private int chooseCity(int n, int[][] arr) {

		int[] result = new int[n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				result[i] += Math.abs(arr[i][0] - arr[j][0]) * arr[j][1];
			}
		}

		int index = 0;
		int temp = result[0];

		for (int i = 0; i < result.length; i++)
			if (temp > result[i])
				index = i;

		return index + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChooseCity chooseCity = new ChooseCity();
		int tn = 3;
		int[][] tcity = { { 1, 5 }, { 2, 2 }, { 3, 3 } };
		System.out.println(chooseCity.chooseCity(tn, tcity));

		int[][] testcase = { { 1, 10000 }, { 2, 20000 }, { 3, 50000 }, { 4, 40000 }, { 5, 50000 }, { 6, 50000 },
				{ 7, 70000 }, { 8, 80000 }, { 9, 9000 }, { 10, 10000 }, { 11, 11000 } };
		System.out.println(chooseCity.chooseCity(11, testcase));
	}

}
