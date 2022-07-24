package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_9086 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < num ; i++) {
			String str = br.readLine();
			System.out.println((str.charAt(0) + "") + (str.charAt(str.length() - 1) + ""));
		}
		br.close();
	}
}
