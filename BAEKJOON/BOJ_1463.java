package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1463 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		
		int[] dp = new int[cnt + 1];
		
		dp[0] = 0;
		dp[1] = 0;
		
		// bottom-up으로 각 연산 방식을 비교하면서 최솟값을 세팅
		for(int i = 2 ; i <= cnt ; i++) {
			dp[i] = dp[i - 1] + 1;
			if(i % 2 == 0) dp[i] = Math.min(dp[i/2] + 1, dp[i]);
			if(i % 3 == 0) dp[i] = Math.min(dp[i/3] + 1, dp[i]);
		}
		
		System.out.println(dp[cnt]);
	}
}
 