package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2908 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int x = (a % 10 * 100) + (a / 10 % 10 * 10) + (a / 100);
		int y = (b % 10 * 100) + (b / 10 % 10 * 10) + (b / 100);
		
		System.out.println(x > y ? x : y);
	}
}
