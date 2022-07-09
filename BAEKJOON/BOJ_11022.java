package bj;

import java.util.Scanner;

public class BOJ_11022 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input = Integer.parseInt(sc.nextLine());
		
		for(int i = 1 ; i <= input ; i++) {
			String str = sc.nextLine();
			int x = str.indexOf(" ");
			int a = Integer.parseInt(str.substring(0, x));
			int b = Integer.parseInt(str.substring(x + 1));
			
			System.out.printf("Case #%d: %d + %d = %d%n", i, a, b, a+b);
		}
		sc.close();
	}
}
