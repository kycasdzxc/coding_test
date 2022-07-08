package springTest.com.crizen.controller;

import java.util.Scanner;

public class BJ_10950 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = Integer.parseInt(sc.nextLine());
		
		for(int i = 0 ; i < cnt ; i++) {
			String input = sc.nextLine();
			
			int x = input.indexOf(" ");
			
			int a = Integer.parseInt(input.substring(0, x));
			int b = Integer.parseInt(input.substring(x + 1));
			
			System.out.println(a + b);
		}
		sc.close();
	}
}
