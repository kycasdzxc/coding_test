package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2744 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String str2 = "";
		for(int i = 0 ; i < str.length() ; i++) {
			if(str.charAt(i) > 96) {
				str2 += (char)(str.charAt(i) - 32);
			} else {
				str2 += (char)(str.charAt(i) + 32);
			}
		}
		br.close();
		System.out.println(str2);
	}
}
