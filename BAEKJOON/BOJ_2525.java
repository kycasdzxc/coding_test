package bj;

import java.util.Scanner;

public class BOJ_2525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();

		int x = input.indexOf(" ");

		int a = Integer.parseInt(input.substring(0, x));
		int b = Integer.parseInt(input.substring(x + 1));
		int c = Integer.parseInt(sc.nextLine());

		while (b + c > 59) {
			if (a == 23) {
				a = 0;
			} else {
				a += 1;
			}
			c = c - 60;
		}
		
		System.out.println(a +" " + (b + c));
		sc.close();
	}
}
