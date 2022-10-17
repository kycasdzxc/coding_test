package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2775 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] apt = new int[15][15];
		
		for(int i = 0 ; i < 15 ; i++) {
			apt[i][1] = 1;
			apt[0][i] = i;
		}
		
		for(int i = 1 ; i < 15 ; i++) {
			for(int j = 2 ; j < 15 ; j++) {
				apt[i][j] = apt[i-1][j] + apt[i][j-1];
			}
		}
		
		int cnt = Integer.parseInt(br.readLine());
		
		int floor = 0;
		int room = 0;
		
		for(int i = 0 ; i < cnt ; i++) {
			floor = Integer.parseInt(br.readLine());
			room = Integer.parseInt(br.readLine());
			System.out.println(apt[floor][room]);
		}
	}
}
