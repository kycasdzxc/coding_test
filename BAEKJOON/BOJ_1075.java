package boj;

import java.util.Scanner;

public class BOJ_1075 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String num = sc.nextLine();
		
		String N = num.substring(0, num.length()-2);
		int F = sc.nextInt();
		
		sc.close();
		
		String result = "";
		
		for(int i = 0 ; i < 100 ; i++) {
			String tmp = "";
			
			if(i < 10) {
				result = "0" + i;
			} else {
				result = i + "";
			}
			
			tmp = N + result;
			
			if(Integer.parseInt(tmp) % F == 0) {
				break;
			}
		}
		
		System.out.println(result);
	}
}
