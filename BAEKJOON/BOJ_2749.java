package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2749 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int pisano = 1500000;
		long num = Long.parseLong(br.readLine()) % pisano;
		
		long[] fivonacci = new long[pisano + 1];
		
		fivonacci[0] = 0;
		fivonacci[1] = 1;
		
		for(int i = 2 ; i <= pisano ; i++) {
			fivonacci[i] = (fivonacci[i-1] + fivonacci[i-2]) % 1000000;
		}
		
		System.out.println(fivonacci[(int)num]);
	}
}
