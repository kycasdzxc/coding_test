package bj;

import java.util.Scanner;

public class BOJ_2753 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input = Integer.parseInt(sc.nextLine());
		
		int result = input % 400 == 0 || (input % 4 == 0 && input % 100 != 0) ? 1 : 0;
		
		System.out.println(result);
		sc.close();
	}
}
