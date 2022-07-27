package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class BOJ_3052 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Set<Integer> nums = new HashSet<Integer>();
		
		for(int i = 0 ; i < 10 ; i++) {
			int num = Integer.parseInt(br.readLine());
			nums.add(num % 42);
		}
		System.out.println(nums.size());
	}
}
