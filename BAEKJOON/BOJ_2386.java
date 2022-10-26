package boj;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_2386 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] nums = new int[9];
		
		String room = sc.nextLine();
		
		for(int i = 0 ; i < room.length() ; i++) {
			if(room.charAt(i) == '9') {
				nums[6]++;
			} else {
				String tmp = room.charAt(i) + "";
				nums[Integer.parseInt(tmp)]++;
			}
		}
		
		nums[6] -= nums[6]/2;
		Arrays.sort(nums);

		System.out.println(nums[nums.length - 1]);
		sc.close();
	}
}
