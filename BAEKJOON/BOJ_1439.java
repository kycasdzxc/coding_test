package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1439 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		double cnt = 0;
		
		if(str.length() > 1) {
			for(int i = 1 ; i < str.length() ; i++) {
				if(str.charAt(i-1) != str.charAt(i)) {
					cnt++;
				}
			}
		}
		
		System.out.println((int)(cnt/2 + 0.9));
	}
}
