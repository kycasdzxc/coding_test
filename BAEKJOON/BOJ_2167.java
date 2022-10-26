package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2167 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] array = new int[N][M];
		
		for(int i = 0 ; i < N ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0 ; j < M ; j++) {
				array[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int cnt = Integer.parseInt(br.readLine());
		
		for(int k = 0 ; k < cnt ; k++) {
			st = new StringTokenizer(br.readLine(), " ");

			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			int sum = 0;
			
			for(int r = i - 1 ; r < x ; r++) {
				for(int l = j - 1 ; l < y ; l++) {
					sum += array[r][l];
				}
			}
			
			System.out.println(sum);
		}
	}
}
