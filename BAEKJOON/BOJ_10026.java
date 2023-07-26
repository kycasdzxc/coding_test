package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10026 {
	static int N;
	
	static char[][] map;
	static boolean[][] visit;
	
	static int[] move_x = {-1, 1, 0, 0}; // 좌우상하
	static int[] move_y = {0, 0, -1, 1}; // 좌우상하

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		
		map = new char[N][N];
		visit = new boolean[N][N];
		
		for(int i = 0 ; i < N ; i++) {
			String str = br.readLine();
			for(int j = 0 ; j < N ; j++) {
				map[i][j] = str.charAt(j);
			}
		}
		
		int normal_cnt = 0; // 정상
		
		for(int i = 0 ; i < N ;i++) {
			for(int j = 0 ; j < N ; j++) {
				if(!visit[i][j]) {
					normal_cnt++;
					DFS(i, j);
				}
			}
		}

		visit = new boolean[N][N]; // 적록색약 구하기 위해 초기화
		
		for(int i = 0 ; i < N ;i++) {
			for(int j = 0 ; j < N ; j++) {
				if(map[i][j] == 'R') {
					map[i][j] = 'G';
				}
			}
		}
		
		int abnormal_cnt = 0; // 적록색약
		
		for(int i = 0 ; i < N ;i++) {
			for(int j = 0 ; j < N ; j++) {
				if(!visit[i][j]) {
					abnormal_cnt++;
					DFS(i, j);
				}
			}
		}
		
		System.out.println(normal_cnt + " " + abnormal_cnt);
	}
	
	public static void DFS(int x, int y) {
		visit[x][y] = true;
		
		for(int i = 0 ; i < 4 ; i++) {
			int mx = x + move_x[i];
			int my = y + move_y[i];
			
			if(mx >= 0 && mx < N && my >= 0 && my < N) {
				if(!visit[mx][my] && map[mx][my] == map[x][y]) {
					DFS(mx, my);
				}
			}
		}
	}
}
