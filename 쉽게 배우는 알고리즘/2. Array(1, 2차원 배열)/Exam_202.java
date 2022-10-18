package exam;

import java.util.Scanner;

public class Exam_202 {
	public static void main(String[] args) {
		// 2. 보이는 학생
		Scanner sc = new Scanner(System.in);
		
		int num = Integer.parseInt(sc.nextLine());
		int[] nums = new int[num];
		
		for(int i = 0 ; i < num ; i++) {
			nums[i] = sc.nextInt();
		}
		
		System.out.println(countHeight(nums));
		sc.close();
	}
	
	private static int countHeight(int[] nums) {
		int max = nums[0];
		int cnt = 1;
		
		for(int i = 1 ; i < nums.length ; i++) {
			if(max < nums[i]) {
				max = nums[i];
				cnt++;
			}
		}
		return cnt;
	}
	
}
