package exam;

import java.util.Scanner;

public class Exam_206 {
	public static void main(String[] args) {
		// 6. 뒤집은 소수
		Scanner sc = new Scanner(System.in);
		
		int num = Integer.parseInt(sc.nextLine());
		int[] nums = new int[num];
		
		for(int i = 0 ; i < num ; i++) {
			nums[i] = sc.nextInt();
		}
		
		eratos(nums);
		sc.close();
	}
	
	private static void eratos(int[] nums) {
		StringBuilder sb = new StringBuilder();
		
		int num = 350;
		boolean[] primes = new boolean[num];
		
		for(int i = 2 ; i < num ; i++) {
			primes[i] = true;
		}
		
		for(int i = 2 ; i < num ; i++) {
			if(primes[i]) {
				for(int j = i * i ; j < num ; j += i) {
					primes[j] = false;
				}
			}
		}
		
		for(int i = 0 ; i < nums.length ; i++) {
			String str = "";
			while(nums[i] > 0) {
				str += nums[i] % 10;
				nums[i] /= 10;
			}
			
			int tmp = Integer.parseInt(str);
			
			if(primes[tmp]) {
				sb.append(tmp + " ");
			}
		}
		
		System.out.println(sb.toString());
	}
	
}
