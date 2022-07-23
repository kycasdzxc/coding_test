package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2754 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String mine = br.readLine();
		
		String[] grade = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D+", "D0", "D-", "F"};
		String[] score = {"4.3", "4.0", "3.7", "3.3", "3.0", "2.7", "2.3", "2.0", "1.7", "1.3", "1.0", "0.7", "0.0"};
		
		for(int i = 0 ; i < 13 ; i++) {
			if(mine.equals(grade[i])) {
				System.out.println(score[i]);
				break;
			}
		}
		br.close();
	}
}
