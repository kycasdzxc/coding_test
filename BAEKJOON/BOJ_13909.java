package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_13909 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		boolean[] windows = new boolean[num];
		
		for(int i = 2 ; i <= num ; i++) {
			for(int j = i ; j <= num ; j += i) {
				if(!windows[j-1]) {
					windows[j-1] = true;
				} else {
					windows[j-1] = false;
				}
			}
		}
		
		int cnt = 0;
		
		for(int i = 0 ; i < num ; i++) {
			if(!windows[i]) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
