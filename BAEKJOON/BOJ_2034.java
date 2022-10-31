package boj;

import java.util.Scanner;

public class BOJ_2034 {
	public static void main(String[] args) {
		boolean[] scale = {true, false, true, false, true, true, false, true, false, true, false, true};
		String[][] code = {{"9", "A"}, {"11", "B"}, {"0", "C"}, {"2", "D"}, {"4", "E"}, {"5", "F"}, {"7", "G"}};
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		int[] jump = new int[cnt];
		
		for(int i = 0 ; i < cnt ; i++) {
			jump[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i < 7 ; i++) {
			int check = Integer.parseInt(code[i][0]);
			boolean flag = true;
			
			for(int j = 0 ; j < cnt ; j++) {
				check += jump[j];
				check %= 12;
				
				if(check < 0) {
					check += 12;
				}
				
				if(!scale[check]) {
					flag = false;
					break;
				}
			}
			
			String last = "";
			
			for(int k = 0 ; k < 7 ; k++) {
				if(Integer.parseInt(code[k][0]) == check) {
					last = code[k][1];
				}
			}
			
			if(flag) {
				System.out.println(code[i][1] + " " + last);
			}
		}
		sc.close();
	}
}
