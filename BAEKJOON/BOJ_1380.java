package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_1380 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] names;
		boolean[][] earring;
		int student = 1;
		int num = Integer.parseInt(br.readLine());
		
		while(num != 0) {
			names = new String[num];
			earring = new boolean[num][2];
			
			for(int i = 0 ; i < num ; i++) {
				names[i] = br.readLine();
			}
			
			for(int i = 1 ; i < num * 2 ; i++) {
				String[] strs = br.readLine().split(" ");
				int cnt = Integer.parseInt(strs[0]);
				int LR = strs[1].equals("A") ? 0 : 1;
				earring[cnt - 1][LR] = true;
			}
			
			for(int i = 0 ; i < names.length ; i++) {
				if(!earring[i][0] || !earring[i][1]) {
					bw.append(student + " " + names[i] + "\n");
					student++;
				}
			}
			num = Integer.parseInt(br.readLine());
		}
		bw.flush();
	}
}
