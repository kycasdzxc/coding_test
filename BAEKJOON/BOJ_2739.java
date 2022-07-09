package boj;

import java.util.Scanner;

public class BOJ_2739 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = Integer.parseInt(sc.nextLine());
		
		if(input >= 2 && input <= 9) {
			for(int i = 1 ; i <= 9 ; i++) {
				System.out.println(input + " * " + i +" = " + input*i);
			}
		}
		
		sc.close();
	}
}
