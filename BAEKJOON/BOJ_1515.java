package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1515 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String num = br.readLine();
		int cnt = 0;
		
		while(num.length() > 0) {
			cnt++;
			String temp = cnt + "";
			
			for(int i = 0 ; i < temp.length() ; i++) {
 				if(num.charAt(0) == temp.charAt(i)) {
 					num = num.substring(1);
				}
				if(num.length() == 0) {
					break;
				}
			}
		}
		System.out.println(cnt);
	}
}
