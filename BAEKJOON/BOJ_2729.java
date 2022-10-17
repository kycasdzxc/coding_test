package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BOJ_2729 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int cnt = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < cnt ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			BigInteger b1 = new BigInteger(st.nextToken(), 2);
			BigInteger b2 = new BigInteger(st.nextToken(), 2);
			sb.append(b1.add(b2).toString(2)).append("\n");
		}
		System.out.println(sb);
	}
}