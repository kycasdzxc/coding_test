package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2839 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		while(x > 0) {
			if(x < 15 && x % 3 == 0) {
				cnt += x/3;
				x = 0;
				break;
			}
			
			x -= 5;
			cnt++;
			
		}
		if(x != 0) {
			cnt = -1;
		}
		System.out.println(cnt);
	}
}
