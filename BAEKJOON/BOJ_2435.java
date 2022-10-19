package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_2435 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int days = Integer.parseInt(st.nextToken());
		int length = Integer.parseInt(st.nextToken());
		
		int[] temp = new int[days];
		int[] calc = new int[days - length + 1];
		
		st = new StringTokenizer(br.readLine(), " ");

		for(int i = 0 ; i < days ; i++) {
			temp[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0 ; i < calc.length ; i++) {
			for(int j = i ; j < i + length ; j++) {
				calc[i] += temp[j];
			}
		}
		
		Arrays.sort(calc);
		
		System.out.println(calc[calc.length - 1]);
	}
}
