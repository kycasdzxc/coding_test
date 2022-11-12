package boj;

import java.util.Scanner;

public class BOJ_14916 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int min = -1;
		
		if(num > 1) {
			for(int i = 1 ; i <= 4 ; i++) {
				if(num % 5 == 0) {
					min = num/5;
				}
				
				int two = 2 * i;
				int sum = num - two;
				
				if(sum < 0) {
					continue;
				}
				
				if(sum % 5 == 0) {
					int result = i + sum/5;
					
					if(min == -1) {
						min = result;
					} else {
						min = Math.min(min, result);
					}
				}
			}
		}
		System.out.println(min);
		sc.close();
	}
}
