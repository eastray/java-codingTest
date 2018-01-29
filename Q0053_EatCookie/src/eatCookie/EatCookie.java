package eatCookie;

import java.util.ArrayList;

public class EatCookie {

	public int eatCookie(int[] cookies) {

		int count = cookies.length;

		int[] list = new int[count + 1];

		int answer = 0;

		for (int j = 0; j < count; j++) {
			int Max = 0;
			for (int k = 0; k < j; k++) {
				if (cookies[j] > cookies[k] && Max < list[k]) {
					System.out.println("j: " + j + " k: " + k);
					System.out.println("cj: " + cookies[j] + " ck: " + cookies[k]);
					System.out.println("max: " + Max + " list[k]: " + list[k]);
					Max = list[k];
					System.out.println("Max: " + Max);
				}
			}
			list[j] = Max + 1;
			
			System.out.println("answer: " + answer + " list: " + list[j]);
			answer = Math.max(answer, list[j]);
		}

		return answer;
	}

	public static void main(String[] args) {

		EatCookie e = new EatCookie();

		int[] cookies = { 1, 4, 2, 6, 3, 4, 1, 5 };

		System.out.println(e.eatCookie(cookies));
	}

}
