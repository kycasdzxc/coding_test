package springTest.com.crizen.controller;

import java.util.Scanner;

public class BJ_2525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			String input = sc.nextLine();
			
			int x = input.indexOf(" ");
			
			int a = Integer.parseInt(input.substring(0, x));
			int b = Integer.parseInt(input.substring(x + 1));
			int c = Integer.parseInt(sc.nextLine());
			
			while(b - c > 59) {
				c = c - 60;
			}
		sc.close();
	}
}
