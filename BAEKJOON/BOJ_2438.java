package boj;

import java.util.Scanner;

public class BOJ_2438 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input = Integer.parseInt(sc.nextLine());
		
		for(int i = 1 ; i <= input ; i++) {
			for(int j = 0 ; j < i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
