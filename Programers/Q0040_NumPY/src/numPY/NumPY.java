package numPY;

public class NumPY {

	private boolean numPY(String str) {
		int pCount = 0;
		int yCount = 0;

		for (char ele : str.toLowerCase().toCharArray())

			if (ele == 'p')
				pCount++;

			else if (ele == 'y')
				yCount++;

		return (pCount == yCount) ? true : false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NumPY py = new NumPY();

		System.out.println(py.numPY("pPoooyY"));
		System.out.println(py.numPY("Pyy"));

	}

}
