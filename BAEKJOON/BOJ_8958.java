package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_8958 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < num ; i++) {
			int cnt = 0;
			int score = 0;
			String str = br.readLine();
			
			for(int j = 0 ; j < str.length() ; j++) {
				if(str.charAt(j) == 'O') {
					cnt++;
					score += cnt;
				} else {
					cnt = 0;
				}
			}
			System.out.println(score);
		}
		
	}
}
