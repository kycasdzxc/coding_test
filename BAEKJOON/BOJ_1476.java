package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1476 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int E = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int year = 1;
		
		int cnt_E = 1;
		int cnt_S = 1;
		int cnt_M = 1;
		
		while(E != cnt_E || S != cnt_S || M != cnt_M) {
			year++;
			
			cnt_E++;
			cnt_S++;
			cnt_M++;
			
			if(cnt_E > 15) {
				cnt_E = 1;
			}
			if(cnt_S > 28) {
				cnt_S = 1;
			}
			if(cnt_M > 19) {
				cnt_M = 1;
			}
		}
		
		System.out.println(year);
	}
}
