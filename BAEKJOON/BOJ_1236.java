package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1236 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		boolean[][] proc = new boolean[n][m];
		
		String s = "";
		
		int row = 0;
		int col = 0;
		
		for(int i = 0 ; i < n ; i++) {
			String x = br.readLine();
			boolean flag = true;
			
			for(int j = 0 ; j < m ; j++) {
				s = x.charAt(j) + "";
				if(s.contentEquals("X")) {
					proc[i][j] = true;
					flag = false;
				}
			}
			if(flag) {
				row++;
			}
		}
		
		for(int i = 0 ; i < m ; i++) {
			boolean flag = true;
			
			for(int j = 0 ; j < n ; j++) {
				if(proc[j][i]) {
					flag = false;
				}
			}
			if(flag) {
				col++;
			}
		}
		
		System.out.println(row > col ? row : col);
	}
}
