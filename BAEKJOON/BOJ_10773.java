package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BOJ_10773 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		List<Long> nums = new ArrayList<Long>();
		
		for(int i = 0 ; i < num ; i++) {
			long x = Long.parseLong(br.readLine());
			if(x == 0 && nums.size() > 0) {
				nums.remove(nums.size() - 1);
			} else {
				nums.add(x);
			}
		}
		
		long sum = 0;
		for(int i = 0 ; i < nums.size() ; i++) {
			sum += nums.get(i);
		}
		System.out.println(sum);
	}
}
