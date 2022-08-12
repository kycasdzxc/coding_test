package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_15829 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int length = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		long prime = 1;
		long hash = 0;
		
		for(int i = 0 ; i < length ; i++) {
			hash += ((str.charAt(i) - 96) * prime) % 1234567891;
			prime = (prime * 31) % 1234567891;
		}
		System.out.println(hash % 1234567891);
	}
}
