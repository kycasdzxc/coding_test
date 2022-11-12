package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1748 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		int result = 0;
		int cnt = 1;
		int length = 10;
		
		for(int i = 1 ; i <= num ; i++) {
			if(i == length) {
				cnt++;
				length *= 10;
			}
			result += cnt;
		}
		
		System.out.println(result);
	}
}
