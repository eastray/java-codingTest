package add;

import java.util.Scanner;

public class Adder {
	
	public int add(int n, int m){
		return n + m;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Adder adder = new Adder();
		Scanner sc = new Scanner(System.in);
		
		System.out.println(adder.add(sc.nextInt(), sc.nextInt()));
	}

}
