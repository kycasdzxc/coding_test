package springTest.com.crizen.controller;

import java.util.Scanner;

public class BJ_8393 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = Integer.parseInt(sc.nextLine());
		int sum = 0;
		
		for(int i = 1 ; i <= cnt ; i++) {
			sum += i;
		}
		
		System.out.println(sum);
		sc.close();
	}
}
