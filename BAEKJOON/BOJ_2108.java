package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_2108 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = Integer.parseInt(br.readLine());
		int[] nums = new int[cnt];
		
		double sum  = 0;
		
		for(int i = 0 ; i < cnt ; i++) {
			nums[i] = Integer.parseInt(br.readLine());
			sum += nums[i];
		}
		
		Arrays.sort(nums);
		
		int count = 0;
		int max = -1;
		int mod = nums[0];
		
		boolean check = false;
		
		//최빈값 구하는 반복문
		for(int i = 0; i < cnt - 1; i++) {
			if(nums[i] == nums[i + 1]) {
				count++;
			}else {
				count = 0;
			}
			
			if(max < count) {
				max = count;
				mod = nums[i];
				check = true;
			}else if(max == count && check == true) {
				mod = nums[i];
				check = false;
			}
		}
		System.out.println(Math.round(sum / cnt)); 	 // 산술평균
		System.out.println(nums[(cnt - 1) / 2]); 	 // 중앙값
		System.out.println(mod); 					 // 최빈값
		System.out.println(nums[cnt - 1] - nums[0]); // 최대값 - 최소값
	}
}
