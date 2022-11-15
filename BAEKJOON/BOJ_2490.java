package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2490 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i = 0 ; i < 3 ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int cnt = 0;
			
			for(int j = 0 ; j < 4 ; j++) {
				if(st.nextToken().equals("1")) {
					cnt++;
				}
			}
			
			String result = "C";
			
			if(cnt == 2) {
				result = "B";
			}
			else if(cnt == 3) {
				result = "A";
			}
			else if(cnt == 4) {
				result = "E";
			}
			else if(cnt == 0) {
				result = "D";
			}
			
			System.out.println(result);
		}
		
		
	}
}
