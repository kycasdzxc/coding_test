package bj;

import java.util.Scanner;

public class BOJ_1110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int input = Integer.parseInt(sc.nextLine()); // 30
		int result = input;
		int cnt = 0;
		int sum = 0;
		boolean flag = true;
		
		while(flag) {
			cnt++;
			
			if(result > 9) {
				sum = (result/10) + (result - (result/10) * 10);
			} else {
				sum = result;
			}
			
			String x = (result - (result/10) * 10) + ""; // result의 1의 자리
			String y = (sum - (sum/10) * 10) + ""; // sum의 1의 자리
			
			result = Integer.parseInt(x + y);
			
			if(result == input) {
				flag = false;
			}
		}
		System.out.println(cnt);
		sc.close();
	}
}
