package exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam1 {
	public static void main(String[] args) throws IOException {
		// 1. 문자 찾기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String strs = br.readLine().toLowerCase();
		String str = br.readLine().toLowerCase();
		int cnt = 0;
		
		for(int i = 0 ; i < strs.length() ; i++) {
			if(strs.charAt(i) == str.charAt(0)) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}
