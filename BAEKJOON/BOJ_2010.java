package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2010 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = Integer.parseInt(br.readLine());
		
		int sum = 1;
		
		for(int i = 0 ; i < cnt ; i++) {
			sum += Integer.parseInt(br.readLine()) - 1;
		}
		
		System.out.println(sum);
	}
}
