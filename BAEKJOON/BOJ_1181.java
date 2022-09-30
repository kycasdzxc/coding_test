package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class BOJ_1181 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int cnt = Integer.parseInt(br.readLine());
		
		String[] strs = new String[cnt];
		
		for(int i = 0 ; i < cnt ; i++) {
			strs[i] = br.readLine();
		}
		
		Arrays.sort(strs, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// 단어길이가 같을 경우
				if(o1.length() == o2.length()) {
					return o1.compareTo(o2);
				} else {
					return o1.length() - o2.length();
				}
			}
		});
		
		sb.append(strs[0]).append("\n");
		
		for(int i = 1 ; i < strs.length ; i++) {
			if(!strs[i].equals(strs[i-1])) {
				sb.append(strs[i]).append("\n");
			}
		}
		System.out.println(sb);
	}
}
