package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1357 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		System.out.println(rev(rev(a) + rev(b)));
	}
	
	public static int rev(int num) {
		String str = "";
		
		while(num > 0) {
			str += num % 10 + "";
			num /= 10;
		}
		return Integer.parseInt(str);
	}
}
