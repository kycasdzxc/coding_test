package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_14582 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] score = new int[2][9];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0 ; i < 9 ; i++) {
			score[0][i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0 ; i < 9 ; i++) {
			score[1][i] = Integer.parseInt(st.nextToken());
		}
		
		boolean flag = false;
		
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i = 0 ; i < 9 ; i++) {
			sum1 += score[0][i];
			
			if(sum1 > sum2) {
				flag = true;
			}
			
			sum2 += score[1][i];
		}
		
		System.out.println(flag ? "Yes" : "No");
	}
}
