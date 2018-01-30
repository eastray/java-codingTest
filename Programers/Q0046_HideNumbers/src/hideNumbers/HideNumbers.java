package hideNumbers;

public class HideNumbers {

	private String hideNumbers(String str) {

		return str.substring(0, str.length() - 5).replaceAll("[0-9]", "*")
				+ str.substring(str.length() - 4, str.length());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HideNumbers hn = new HideNumbers();

		System.out.println(hn.hideNumbers("01012345678"));
		System.out.println(hn.hideNumbers("0421234567"));
	}

}
