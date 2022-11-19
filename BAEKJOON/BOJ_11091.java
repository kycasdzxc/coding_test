package boj;

import java.util.Scanner;

public class BOJ_11091 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = Integer.parseInt(sc.nextLine());
		
		for(int i = 0 ; i < num ; i++) {
			boolean[] alpabet = new boolean[26];
			
			String str = sc.nextLine().toLowerCase();
			
			for(int j = 0 ; j < str.length() ; j++) {
				if(str.charAt(j) >= 'a' && str.charAt(j) <= 'z') {
					alpabet[str.charAt(j) - 97] = true;
				}
			}
			
			String tmp = "";
			
			for(int j = 0 ; j < 26 ; j++) {
				if(!alpabet[j]) {
					tmp += (char)(j + 97);
				}
			}
			
			if(tmp.equals("")) {
				System.out.println("pangram");
			} else {
				System.out.println("missing " + tmp);
			}
		}
		
		sc.close();
	}
}
