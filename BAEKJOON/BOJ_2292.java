package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2292 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(br.readLine());
		
		int num = 1;
		for(int i = 0; i <= 1_000_000_000 ; i++) {
			num += i * 6;
			if(x <= num) {
				System.out.println(i+1);
				break;
			}
		}
	}
}
