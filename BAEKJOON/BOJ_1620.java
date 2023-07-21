package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ_1620 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int total = Integer.parseInt(st.nextToken());
		int find = Integer.parseInt(st.nextToken());
		
		Map<String, Integer> map_str = new HashMap<>();
		Map<Integer, String> map_int = new HashMap<>();
		
		for(int i = 1 ; i <= total ; i++) {
			String str = br.readLine();
			map_str.put(str, i);
			map_int.put(i, str);
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0 ; i < find ; i++) {
			String str = br.readLine();
			
			if(Character.isDigit(str.charAt(0))) {
				sb.append(map_int.get(Integer.parseInt(str)));
			} else {
				sb.append(map_str.get(str));
			}
			sb.append("\n");				
		}
		
		System.out.println(sb.toString());
	}
}
 