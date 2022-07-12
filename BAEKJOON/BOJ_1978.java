package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1978 {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int cnt = 0;
		
		for(int i = 0 ; i < x ; i++) {
			int num = Integer.parseInt(st.nextToken());
			boolean flag = true;
			
			if(num == 1) {
				continue;
			}
			for(int j = 2 ; j < num ; j++) {
				if(num % j == 0) {
					flag = false;
					break;
				}
			}
			if(flag) {
				cnt++;
			}
		}
		br.close();
		System.out.println(cnt);
	}
}
