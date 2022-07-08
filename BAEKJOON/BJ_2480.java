package springTest.com.crizen.controller;

import java.util.Scanner;

public class BJ_2480 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		int x = input.indexOf(" ");
		int y = input.lastIndexOf(" ");

		int a = Integer.parseInt(input.substring(0, x));
		int b = Integer.parseInt(input.substring(x + 1, y));
		int c = Integer.parseInt(input.substring(y + 1));
		
		if (a > 0 && a <= 6 && b > 0 && b <= 6 && c > 0 && c <= 6) {
			if(a == b && b == c) {
				System.out.println(10000 + a * 1000);
			}
			else if(a == b || a == c) {
				System.out.println(1000 + a * 100);
			}
			else if(b == c) {
				System.out.println(1000 + b * 100);
			} else {
				if(a > b && a > c) {
					System.out.println(a * 100);
				}
				else if(b > a && b > c) {
					System.out.println(b * 100);
				}
				else {
					System.out.println(c * 100);
				}
			}
		}
		sc.close();
	}
}
