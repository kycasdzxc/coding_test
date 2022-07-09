package bj;

import java.util.Scanner;

public class BOJ_2439 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input = Integer.parseInt(sc.nextLine());
		
		for(int i = 1 ; i <= input ; i++) {
			for(int j = 0 ; j < input ; j++) {
				if(j + i >= input) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
