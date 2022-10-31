package boj;

import java.util.Scanner;

public class BOJ_1076 {
	public static void main(String[] args) {
		String[][] color = {
				{"black", "1"}, {"brown", "10"}, {"red", "100"}, {"orange", "1000"},
				{"yellow", "10000"}, {"green", "100000"}, {"blue", "1000000"}, {"violet", "10000000"},
				{"grey", "100000000"}, {"white", "1000000000"}
		};
		
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		String s3 = sc.nextLine();

		String r1 = "";
		String r2 = "";
		String r3 = "";
		
		for(int i = 0 ; i < color.length ; i++) {
			if(s1.equals(color[i][0])) {
				r1 = i + "";
			}
			if(s2.equals(color[i][0])) {
				r2 = i + "";
			}
			if(s3.equals(color[i][0])) {
				r3 = color[i][1];
			}
		}
		
		System.out.println(Long.parseLong(r1 + r2) * Long.parseLong(r3));
		sc.close();
	}
}
