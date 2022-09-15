package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_9012 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < num ; i++) {
			String str = br.readLine();
			boolean flag = true;
			int cnt = 0;
			
			for(int j = 0 ; j < str.length() ; j++) {
				if(str.charAt(j) == '(') {
					cnt++;
				} else {
					cnt--;
				}
				if(cnt < 0) {
					flag = false;
					break;
				}
			}
			
			if(flag && cnt == 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
