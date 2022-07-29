package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_15964 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		System.out.println(calc(Long.parseLong(st.nextToken()), Long.parseLong(st.nextToken())));
	}
	
	private static long calc(long a, long b) {
		return (a + b) * (a - b);
	}
}
