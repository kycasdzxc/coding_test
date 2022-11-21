package boj;

import java.util.Scanner;

public class BOJ_11721 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		
		while(str.length() > 0) {
			if(str.length() > 10) {
				sb.append(str.substring(0, 10)).append("\n");
				str = str.substring(10);
			} else {
				sb.append(str);
				str = "";
			}
		}
		System.out.println(sb);
		sc.close();
	}
}
