package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_18110 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = Integer.parseInt(br.readLine());
		int[] score = new int[cnt];
		
		for(int i = 0 ; i < cnt ; i++) {
			score[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(score);
		
		int calc = (int) (((cnt * 0.15) + 0.5));
		double sum = 0;
		
		for(int i = calc ; i < cnt - calc ; i++) {
			sum += score[i];
		}
		
		System.out.println((int) ((sum / (cnt - (calc * 2))) + 0.5));
	}
}
