package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_18698 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < num ; i++) {
			String str = br.readLine();
			int cnt = 0;
			
			for(int j = 0 ; j < str.length() ; j++) {
				if(str.charAt(j) == 'U') {
					cnt++;
				} else {
					break;
				}
			}
			System.out.println(cnt);
		}
	}
}
