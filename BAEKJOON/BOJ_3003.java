package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_3003 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[] chess = {1, 1, 2, 2, 2, 8};
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0 ; i < 6 ; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			sb.append(chess[i] - tmp + " ");
		}
		
		System.out.println(sb.toString());
	}
}
