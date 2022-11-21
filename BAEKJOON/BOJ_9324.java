package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_9324 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < num ; i++) {
			int[] alpabet = new int[26];
			
			boolean flag = true;
			String str = br.readLine();
			
			for(int j = 0 ; j < str.length() ; j++) {
				alpabet[str.charAt(j) - 65]++;
				
				if(alpabet[str.charAt(j) - 65] == 3) {
					if(j + 1 >= str.length()) {
						flag = false;
						break;
					} 
					
					if(str.charAt(j+1) == str.charAt(j)) {
						alpabet[str.charAt(j++) - 65] = 0;
					} else {
						flag = false;
						break;
					}
				}
			}
			
			if(flag) {
				System.out.println("OK");
			} else {
				System.out.println("FAKE");
			}
		}
	}
}
