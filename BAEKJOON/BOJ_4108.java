package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_4108 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int R = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		while(R != 0 && C != 0) {
			int[][] mine = new int[R][C];
			
			for(int i = 0 ; i < R ; i++) {
				String row = br.readLine();
				
				for(int j = 0 ; j < C ; j++) {
					if(row.charAt(j) == '.') {
						continue;
					} else {
						mine[i][j] = -1;
						
						for(int a = i - 1 ; a <= i + 1 ; a++) {
							for(int b = j - 1 ; b <= j + 1 ; b++) {
								if(a < 0 || a >= R || b < 0 || b >= C || mine[a][b] == -1) {
									continue;
								} else {
									mine[a][b]++;
								}
							}
						}
					}
				}
			}
			
			StringBuilder sb = new StringBuilder();
			
			for(int i = 0 ; i < R ; i++) {
				for(int j = 0 ; j < C ; j++) {
					if(mine[i][j] == -1) {
						sb.append("*");
					} else {
						sb.append(mine[i][j]);
					}
				}
				sb.append("\n");
			}
			System.out.print(sb.toString());
			
			st = new StringTokenizer(br.readLine(), " ");
			
			R = Integer.parseInt(st.nextToken());
			C = Integer.parseInt(st.nextToken());
		}
	}
}
