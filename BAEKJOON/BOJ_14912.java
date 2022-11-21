package boj;

import java.util.Scanner;

public class BOJ_14912 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int x = sc.nextInt();
		
		int cnt = 0;
		String str = "";
		
		for(int i = 1 ; i <= num ; i++) {
			str = i + "";
			
			for(int j = 0 ; j < str.length() ; j++) {
				if(x == Character.getNumericValue(str.charAt(j))) {
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
		sc.close();
	}
}
