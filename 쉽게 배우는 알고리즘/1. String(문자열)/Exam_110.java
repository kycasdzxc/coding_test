package exam;

import java.util.Scanner;

public class Exam_110 {
	public static void main(String[] args) {
		// 10. 가장 짧은 문자거리
		Scanner sc = new Scanner(System.in);
		System.out.println(checkedNumber(sc.nextLine()));
		sc.close();
	}
	
	private static String checkedNumber(String str) {
		StringBuilder sb = new StringBuilder();
		
		String[] nums = str.split(" ");				
		
		int first = 0;
		int second = 0;
		int pos = 0;
		
		for(int i = 0 ; i < nums[0].length() ; i++) {
			if(i == nums[0].indexOf(nums[1], i)) {
				pos = i;
			}
			
			first = nums[0].indexOf(nums[1], pos);
			second = nums[0].indexOf(nums[1], i);
			
			if(i - first < second - i) {
				sb.append(Math.abs(i -first) + " ");
			} else {
				sb.append(second - i + " ");
			}
		}
		return sb.substring(0, sb.length() - 1).toString();
	}
}
