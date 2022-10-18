package exam;

import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Exam_201 {
	public static void main(String[] args) throws IOException {
		// 1. 큰수 출력하기
		Scanner sc = new Scanner(System.in);
		
		int num = Integer.parseInt(sc.nextLine());
		StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");
		
		int[] nums = new int[num];
		
		for(int i = 0 ; i < num ; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(compareNum(nums));
		sc.close();
	}
	
	private static String compareNum(int[] nums) {
		StringBuilder sb = new StringBuilder();
		
		sb.append(nums[0]).append(" ");
		
		for(int i = 1 ; i < nums.length ; i++) {
			if(nums[i-1] <= nums[i]) {
				sb.append(nums[i]).append(" ");
			}
		}
		
		return sb.toString().trim();
	}
	
}
