package boj;

import java.util.Scanner;

public class BOJ_2145 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		while(num != 0) {
			int tmp = 0;
			int result = num;
			
			do {
				tmp = result;
				result = 0;
				
				while(tmp != 0) {
					result += tmp % 10;
					tmp /= 10;
				}
			} while(result > 9);
			System.out.println(result);
			num = sc.nextInt();
		}
		sc.close();
	}
}
