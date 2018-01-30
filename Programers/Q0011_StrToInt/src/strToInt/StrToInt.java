package strToInt;

public class StrToInt {
	
	private int strToInt (String str) {
		
		return Integer.parseInt(str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StrToInt strToInt = new StrToInt();
		
		System.out.println(strToInt.strToInt("1234"));
		System.out.println(strToInt.strToInt("-1234"));

	}

}
