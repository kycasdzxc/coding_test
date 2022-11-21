package boj;

import java.util.Scanner;

public class BOJ_12871 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		String str = s1;
		String str2 = s2;
		
		if(s1.length() > s2.length()) {
			str = s1;
			str2 = s2;
		} else {
			str = s2;
			str2 = s1;
		}
		
		if(str.replace(str2, "").length() > 0 || str2.replace(str, "").length() > 0) {
			System.out.println(0);
		} else {
			System.out.println(1);
		}
		
		sc.close();
	}
}
