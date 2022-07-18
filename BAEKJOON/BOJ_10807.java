package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10807 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int total = 0;
		int cnt = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < num ; i++) {
			if(Integer.parseInt(st.nextToken()) == cnt) {
				total++;
			};
		}
		System.out.println(total);
		br.close();
	}
}
