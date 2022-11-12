package boj;

import java.util.Scanner;

public class BOJ_2018 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int cnt = 1;
		
		for(int i = 1 ; i < num/2 + 1 ; i++) {
			int sum = i;
			for(int j = i + 1 ; i < num/2 + 2 ; j++) {
				if(sum == num) {
					cnt++;
					break;
				}
				
				if(sum > num) {
					break;
				}
				
				sum += j;
			}
		}
		System.out.println(cnt);
		sc.close();
	}
}
