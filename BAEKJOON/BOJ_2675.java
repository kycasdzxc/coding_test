package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ_2675 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cnt = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for(int i = 0 ; i < cnt ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int num = Integer.parseInt(st.nextToken());
			String word = st.nextToken().toUpperCase();
			
			for(int j = 0 ; j < word.length() ; j++) {
				for(int k = 0 ; k < num ; k++) {
					bw.write(word.charAt(j));
				}
			}
			bw.write("\n");
			bw.flush();
		}
	}
}
