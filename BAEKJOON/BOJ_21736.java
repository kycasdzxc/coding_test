package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_21736 {
	static int N, M;
	
	static char[][] map;
	static boolean[][] visit;
	
	static int[] move_x = {-1, 1, 0, 0}; // 좌우상하
	static int[] move_y = {0, 0, -1, 1}; // 좌우상하

	static int cnt = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new char[N][M];
		visit = new boolean[N][M];
		
		int x = 0;
		int y = 0;
		
		for(int i = 0 ; i < N ; i++) {
			String str = br.readLine();
			for(int j = 0 ; j < M ; j++) {
				map[i][j] = str.charAt(j);
				
				if(map[i][j] == 'I') {
					x = i;
					y = j;
				}
			}
		}
		
		DFS(x, y);
		
		System.out.println(cnt > 0 ? cnt : "TT");
	}
	
	public static void DFS(int x, int y) {
		visit[x][y] = true;
		
		if(map[x][y] == 'P') {
			cnt++;
		}
		
		for(int i = 0 ; i < 4 ; i++) {
			int mx = x + move_x[i];
			int my = y + move_y[i];
			
			if(mx >= 0 && mx < N && my >= 0 && my < M && !visit[mx][my] && map[mx][my] != 'X') {
				DFS(mx, my);
			}
		}
	}
}
