package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class BOJ_2204 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = Integer.parseInt(br.readLine());
		
		while(cnt != 0) {
			String[] strs = new String[cnt];
			
			for(int i = 0 ; i < cnt ; i++) {
				strs[i] = br.readLine();
			}
			
			Arrays.sort(strs, new Comparator<String>() {

				@Override
				public int compare(String arg0, String arg1) {
					return arg0.compareToIgnoreCase(arg1);
				}
			});
			
			System.out.println(strs[0]);
			cnt = Integer.parseInt(br.readLine());
		}
	}
}
