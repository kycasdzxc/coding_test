package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_5597 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean[] nums = new boolean[30];
		
		for(int i = 0 ; i < 28 ; i++) {
			int x = Integer.parseInt(br.readLine()) - 1;
			nums[x] = true;
		}
		for(int i = 0 ; i < nums.length ; i++) {
			if(!nums[i]) {
				System.out.println(i+1);
			}
		}
		br.close();
	}
}
