package boj;

import java.util.Scanner;

public class BOJ_2530 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		int second = sc.nextInt();
		
		int time = sc.nextInt();
		
		sc.close();
		
		hour += time / 3600;
		minute += time / 60 % 60;
		second += time % 60;
		
		if(second > 59) {
			second -= 60;
			minute++;
		}
		if(minute > 59) {
			minute -= 60;
			hour++;
		}
		
		hour %= 24;
		
		System.out.println(hour + " " + minute + " " + second);
	}
}
