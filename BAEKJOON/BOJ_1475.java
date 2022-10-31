package boj;

import java.util.Scanner;

public class BOJ_1475 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		while(!str.equals("#")) {
			char check = str.charAt(0);
			str = str.substring(2).toLowerCase();
			
			int cnt = 0;
			
			for(int i = 0 ; i < str.length() ; i++) {
				if(str.charAt(i) == check) {
					cnt++;
				}
			}
			System.out.println(check + " " + cnt);
			str = sc.nextLine();
		}
		sc.close();
	}
}
