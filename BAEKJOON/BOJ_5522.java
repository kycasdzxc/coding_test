package boj;

import java.util.Scanner;

public class BOJ_5522 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long sum = 0;
		for(int i = 0 ; i < 5 ; i++) {
			sum += Long.parseLong(sc.nextLine());
		}
		System.out.println(sum);
		sc.close();
	}
}
