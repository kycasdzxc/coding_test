package springTest.com.crizen.controller;

import java.util.Scanner;

public class BJ_1330 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		int x = input.indexOf(" ");
		
		int a = Integer.parseInt(input.substring(0, x));
		int b = Integer.parseInt(input.substring(x + 1));
		
		if(a > b) {
			System.out.println(">");
		}
		else if(a < b) {
			System.out.println("<");
		}
		else {
			System.out.println("==");
		}
		
		sc.close();
	}
}
