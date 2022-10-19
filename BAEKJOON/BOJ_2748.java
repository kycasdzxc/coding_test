package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2748 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long[] fivonacci = new long[91];
		
		fivonacci[0] = 0;
		fivonacci[1] = 1;
		
		for(int i = 2 ; i < fivonacci.length ; i++) {
			fivonacci[i] = fivonacci[i-1] + fivonacci[i-2];
		}
		int num = Integer.parseInt(br.readLine());
		
		System.out.println(fivonacci[num]);
	}
}
