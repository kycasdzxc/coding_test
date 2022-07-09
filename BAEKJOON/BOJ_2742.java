package boj;

import java.util.Scanner;

public class BOJ_2742 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input = Integer.parseInt(sc.nextLine());
		
		for(int i = 0 ; i < input ; i++) {
				System.out.println(input - i);
		}
		sc.close();
	}
}
