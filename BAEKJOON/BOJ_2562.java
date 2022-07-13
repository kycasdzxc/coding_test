package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_2562 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int max = 0;
		int cnt = -1;
		
		for(int i = 0 ; i < 9 ; i++) {
			int x = Integer.parseInt(br.readLine());
			
			if(x > max) {
				max = x;
				cnt = i + 1;
			}
		}
		bw.write(max + "\n");
		bw.write(cnt + "\n");
		
		bw.flush();
	}
}
