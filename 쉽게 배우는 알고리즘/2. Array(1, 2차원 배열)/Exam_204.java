package exam;

import java.util.Scanner;

public class Exam_204 {
	public static void main(String[] args) {
		// 4. 피보나치 수열
		Scanner sc = new Scanner(System.in);
		
		int num = Integer.parseInt(sc.nextLine());
		
		fibonacci(num);
		sc.close();
	}
	
	private static void fibonacci(int num) {
		StringBuilder sb = new StringBuilder();
		
		int[] nums = new int[num];
		
		nums[0] = nums[1] = 1;
		sb.append(nums[0] + " " + nums[1]);
		for(int i = 2 ; i < num ; i++) {
			nums[i] = nums[i-1] + nums[i-2];
			sb.append(" " + nums[i]);
		}
		
		System.out.println(sb.toString());
	}
	
}
