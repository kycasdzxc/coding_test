package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_11399 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = Integer.parseInt(br.readLine());

		String[] tmp = br.readLine().split(" ");
		int[] number = new int[cnt];
		
		for(int i = 0 ; i < cnt ; i++) {
			number[i] = Integer.parseInt(tmp[i]);
		}
		
		Arrays.sort(number);

		int sum = 0;
		int result = 0;

		for(int i = 0 ; i < cnt ; i++) {
			sum += number[i];
			result += sum;
		}
		
		System.out.println(result);
	}
}
