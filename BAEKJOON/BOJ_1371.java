package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_1371 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] cnt = new int[26];
		String str = "";
		
		while((str = br.readLine()) != null) {
			for(int i = 0 ; i < str.length() ; i++) {
				int c = str.charAt(i) - 97;
				if(c >= 0 && c < 28) {
					cnt[c]++;
				} else {
					continue;
				}
			}
		}
		
		int max = -1;
		
		for(int i = 0 ; i < cnt.length ; i++) {
			if(cnt[i] > max) {
				max = cnt[i];
			}
		}
		
		for(int i = 0 ; i < cnt.length ; i++) {
			if(cnt[i] == max) {
				bw.append((char)(i + 97));
			}
		}
		bw.flush();
	}
}
