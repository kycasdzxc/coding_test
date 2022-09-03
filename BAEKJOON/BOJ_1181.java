package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1181 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		long[] nums = new long[3];
		nums[0] = Long.parseLong(st.nextToken());
		nums[1] = Long.parseLong(st.nextToken());
		nums[2] = Long.parseLong(st.nextToken());
		
		while(nums[0] != 0 && nums[1] != 0 && nums[2] != 0) {
			Arrays.sort(nums);
			if(Math.pow(nums[0], 2) + Math.pow(nums[1], 2) == Math.pow(nums[2], 2)) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
			st = new StringTokenizer(br.readLine(), " ");
			
			nums[0] = Long.parseLong(st.nextToken());
			nums[1] = Long.parseLong(st.nextToken());
			nums[2] = Long.parseLong(st.nextToken());
		}
	}
}
