package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10870 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine()) + 1;
		int[] pibo = new int[num];
		pibo[0] = 0;
		
		if(num - 1 > 0) {
			pibo[1] = 1;
			for(int i = 2 ; i < num ; i++) {
				pibo[i] = pibo[i-1] + pibo[i-2];
			}
			System.out.println(pibo[num-1]);
		} else {
			System.out.println(0);
		}
		br.close();
	}
}
