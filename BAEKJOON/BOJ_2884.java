package bj;

import java.util.Scanner;

public class BOJ_2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		int x = input.indexOf(" ");
		int hour = Integer.parseInt(input.substring(0, x));
		int minute = Integer.parseInt(input.substring(x + 1));
		
		if(minute - 45 < 0) {
			hour -= 1;
			if(hour < 0) {
				hour = 23;
			}
			minute += 15;
		} else {
			minute -= 45;
		}
		System.out.println(hour + " " + minute);
		sc.close();
	}
}
