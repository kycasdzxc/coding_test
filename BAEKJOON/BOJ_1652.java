package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1652 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = Integer.parseInt(br.readLine());
		
		String[][] room = new String[cnt][cnt];
		
		for(int i = 0 ; i < cnt ; i++) {
			String str = br.readLine();
			
			for(int j = 0 ; j < cnt ; j++) {
				room[i][j] = String.valueOf(str.charAt(j));
			}
		}
		
		int N = 0;
		
		for(int i = 0 ; i < cnt ; i++) {
			boolean flag = false;
			for(int j = 1 ; j < cnt ; j++) {
				if(!flag && !room[i][j-1].equals("X") && room[i][j-1].equals(room[i][j])) {
					N++;
					flag = true;
				}
				else if(room[i][j-1].equals("X")) {
					flag = false;
				}
			}
		}
		
		int M = 0;
		
		for(int i = 0 ; i < cnt ; i++) {
			boolean flag = false;
			for(int j = 1 ; j < cnt ; j++) {
				if(!flag && !room[j-1][i].equals("X") && room[j-1][i].equals(room[j][i])) {
					M++;
					flag = true;
				}
				else if(room[j-1][i].equals("X")) {
					flag = false;
				}
			}
		}
		
		System.out.println(N + " " + M);
	}
}
