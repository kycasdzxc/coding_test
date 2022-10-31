package boj;

import java.util.Scanner;

public class BOJ_1550 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		System.out.println(Integer.parseInt(str, 16));
		sc.close();
	}
}
