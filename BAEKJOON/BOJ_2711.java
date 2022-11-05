package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2711 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0 ; i < cnt ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int num = Integer.parseInt(st.nextToken());
			String str = st.nextToken();
			
			str = str.substring(0, num-1) + str.substring(num);
			
			sb.append(str).append("\n");
		}
		
		System.out.println(sb);
	}
}
