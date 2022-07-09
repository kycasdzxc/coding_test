package boj;

import java.util.Scanner;

public class BOJ_1065 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = Integer.parseInt(sc.nextLine());
		int result = 99; // 100 이상일 때 사용
		
		if(num < 100) {
			System.out.println(num);
		} else {
			for(int i = 100 ; i <= num ; i++) {
				result += han(i);
			}
			System.out.println(result);
		}
		sc.close();
	}
	
	private static int han(int num) {
		int hundred = num / 100;
		int ten = num % 100 / 10;
		int one = num % 10;
		
		// 등차수열의 특징 : 가운데 숫자에 2를 곱하면 직전과 직후 숫자의 합과 동일
		if(ten*2 == hundred + one) {
			return 1;
		}
		
		return 0;
	}
}
