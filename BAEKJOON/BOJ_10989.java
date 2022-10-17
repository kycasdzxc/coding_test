package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_10989 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = Integer.parseInt(br.readLine());
		int[] nums = new int[cnt];
		
		for(int i = 0 ; i < cnt ; i++) {
			nums[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(nums);
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0 ; i < cnt ; i++) {
			sb.append(nums[i]).append("\n");
		}
		
		System.out.println(sb);
	}
}
