package waterMelon;

public class WaterMelon {
	
	private String watermelon(int n) {
		String result = "";
		String watermelon = "수박";
		
		for(int i = 0; i < n/2; i++)
			result += watermelon;
		
		result += (n%2 == 1) ? watermelon.charAt(0) : "";
		
		return result;
	}
	
	public String watermelon2(int n){

        return new String(new char [n/2+1]).replace("\0", "수박").substring(0,n);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WaterMelon wm = new WaterMelon();
		System.out.println("n이 3인 경우: " + wm.watermelon(3));
		System.out.println("n이 4인 경우: " + wm.watermelon(4));
		
		System.out.println("n이 3인 경우: " + wm.watermelon2(3));
		System.out.println("n이 4인 경우: " + wm.watermelon2(4));
	}

}
