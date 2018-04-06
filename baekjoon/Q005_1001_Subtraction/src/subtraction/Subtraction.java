package subtraction;

import java.util.Scanner;

public class Subtraction {
	
	public int subtraction(int n, int m){
		return n-m;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Subtraction st = new Subtraction();
		Scanner sc = new Scanner(System.in);
		
		System.out.println(st.subtraction(sc.nextInt(), sc.nextInt()));
	}

}
