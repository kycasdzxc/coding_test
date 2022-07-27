package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2577 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] nums = new int[10];
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		
		int sum = a * b * c;
		
		while(sum > 0) {
			int x = sum % 10;
			nums[x]++;
			sum /= 10;
		}
		
		for(int i = 0 ; i < nums.length ; i++) {
			System.out.println(nums[i]);
		}
	}
}
