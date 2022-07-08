package springTest.com.crizen.controller;

import java.util.Scanner;

public class BJ_9498 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = Integer.parseInt(sc.nextLine());
		
		if(input >= 90) {
			System.out.println("A");
		}
		else if(input >= 80) {
			System.out.println("B");
		}
		else if(input >= 70) {
			System.out.println("C");
		}
		else if(input >= 60) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
		
		sc.close();
	}
}
