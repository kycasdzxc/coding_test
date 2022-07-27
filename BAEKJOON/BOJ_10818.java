package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10818 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		int[] nums = new int[x];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0 ; i < nums.length ; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		
		int min = 1_000_000;
		int max = -1_000_000;
		
		for(int i = 0 ; i < nums.length ; i++) {
			int num = nums[i];
			if(num >= max) {
				max = num;
			}
			if(min >= num) {
				min = num;
			}
		}
		System.out.println(min + " " + max);
	}
}
