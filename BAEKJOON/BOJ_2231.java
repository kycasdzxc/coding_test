package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2231 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String first = br.readLine();
		int length = first.length();
		int num = 1;
		
		int result = Integer.parseInt(first);
		
		if(result > 18) {
			num = Integer.parseInt(first) - length * 9;
		}
		
		boolean flag = false;
		int tmp = -1;
		int cnt = -1;
		
		for(int i = 0 ; i < length * 9 ; i++) {
			if(num < 10) {
				tmp = num + num;
				
				if(result == tmp) {
					flag = true;
					break;
				} else {
					num++;
				}
				
			} else {
				tmp = num;
				cnt = num;
				
				while(cnt > 0) {
					tmp += cnt % 10;
					cnt /= 10;
				}
				
				if(result == tmp) {
					flag = true;
					break;
				} else {
					num++;
				}
			}
		}
		System.out.println(flag ? num : 0);
	}
}
