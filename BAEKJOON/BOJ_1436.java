package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1436 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		int six = 666;
		
		while(num != cnt) {
			if((six + "").contains("666")) {
				cnt++;
			}
			six++;
		}
		System.out.println(six - 1);
	}
}
