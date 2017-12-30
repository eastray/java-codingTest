package findKim;

import java.util.Arrays;

public class FindKim {

	private String findKim(String[] seoul) {

		for(int i = 0; i < seoul.length; i++)
			if(seoul[i].equals("Kim"))
				return "김서방은 " + i + "에 있다";

		return null;
	}
	
	public String findKim2(String[] seoul){

		return "김서방은 " + Arrays.asList(seoul).indexOf("Kim") + "에 있다.";

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindKim kim = new FindKim();
		String[] names = { "Queen", "Tod", "Kim" };
		System.out.println(kim.findKim(names));
		System.out.println(kim.findKim2(names));
	}

}
