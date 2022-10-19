package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BOJ_10826 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		BigInteger[] fivonacci = new BigInteger[10001];
		
		fivonacci[0] = BigInteger.ZERO;
		fivonacci[1] = BigInteger.ONE;
		
		for(int i = 2 ; i < fivonacci.length ; i++) {
			fivonacci[i] = fivonacci[i-1].add(fivonacci[i-2]);
		}
		int num = Integer.parseInt(br.readLine());

		System.out.println(fivonacci[num]);
	}
}
