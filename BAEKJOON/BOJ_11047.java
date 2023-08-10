package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11047 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int cnt = Integer.parseInt(st.nextToken());
		int sum = Integer.parseInt(st.nextToken());
		
		int[] money = new int[cnt];
		
		for(int i = 0 ; i < cnt ; i++) {
			money[i] = Integer.parseInt(br.readLine());
		}
		
		int result = 0;
		
		for(int i = cnt - 1 ; 0 <= i ; i--) {
			result += sum / money[i];
			sum %= money[i];
			
			if(sum == 0) {
				break;
			}
		}
		
		System.out.println(result);
	}
}
