package boj;

import java.util.Scanner;

public class BOJ_9656 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int stone = sc.nextInt();
		
		System.out.println(stone % 2 == 0 ? "SK" : "CY");
		
		sc.close();
	}
}
