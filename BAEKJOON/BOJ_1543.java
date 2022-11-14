package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1543 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String strs = br.readLine();
		String str = br.readLine();
		
		int cnt = 0;
		
		while(strs.contains(str)) {
			cnt++;
			strs = strs.substring(strs.indexOf(str) + str.length());
		}
		
		System.out.println(cnt);
	}
}
