package boj;

import java.util.Scanner;

public class BOJ_2631 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = Integer.parseInt(sc.nextLine());
		int[] students = new int[num];
		
		for(int i = 0 ; i < num ; i++) {
			students[i] = Integer.parseInt(sc.nextLine());
		}
		
		int[] dp = new int[num];
		dp[0] = 1;
		
		int ans = 0;
		
		for(int i = 1 ; i < num ; i++) {
			dp[i] = 1;
			
			for(int j = 0 ; j < i ; j++) {
				if(students[i] > students[j]) {
					dp[i] = Math.max(dp[i], dp[j]+1);
				}
			}
			ans = Math.max(ans,  dp[i]);
		}
		System.out.println(num - ans);
		sc.close();
	}
}
