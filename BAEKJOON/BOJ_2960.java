package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2960 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		boolean[] prime = new boolean[N + 1];
		
		prime[0] = prime[1] = true;
		
		int cnt = 0;
		int result = -1;
		
		for(int i = 2 ; i <= N ; i++) {
			if(!prime[i]) {
				for(int j = i ; j <= N ; j += i) {
					if(!prime[j]) {
						prime[j] = true;
						cnt++;
						if(K == cnt) {
							result = j;
							break;
						}
					}
				}
			}
			if(result > 0) {
				break;
			}
		}
		
		System.out.println(result);
	}
}
