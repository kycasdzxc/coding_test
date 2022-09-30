package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BOJ_10814 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int cnt = Integer.parseInt(br.readLine());
		
		String[][]  strs = new String[cnt][2];
		
		for(int i = 0 ; i < cnt ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			strs[i][0] = st.nextToken(); // 나이
			strs[i][1] = st.nextToken(); // 이름
		}
		
		Arrays.sort(strs, new Comparator<String[]>() {
			
			@Override
			public int compare(String[] o1, String[] o2) {
				return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
			}
		});
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0 ; i < cnt ; i++) {
			sb.append(strs[i][0]).append(" ").append(strs[i][1]).append("\n");
		}
		
		System.out.println(sb);
	}
}
