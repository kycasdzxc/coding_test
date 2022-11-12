package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1790 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		long num = Long.parseLong(st.nextToken());
		long k = Long.parseLong(st.nextToken());
		
		long result = 0;
		long cnt = 1;
		long length = 10;
		long tmp = k == 1 ? 1 : -1;
		
		for(int i = 1 ; i <= num + 1 ; i++) {
			if(result >= k) {
				tmp = i - 1;
				break;
			}
			if(i == length) {
				cnt++;
				length *= 10;
			}
			
			result += cnt;
		}
		
		if(tmp != -1) {
			String str = tmp + "";
			System.out.println(str.charAt((int)(str.length() - (result - k) - 1)));
		} else {
			System.out.println(-1);
		}
	}
}
