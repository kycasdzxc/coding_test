package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_23795 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = 0;
		int sum = 0;
		
		while(true) {
			num =Integer.parseInt(br.readLine());

			if(num == -1) {
				break;
			} else {
				sum += num;
			}
		}
		System.out.println(sum);
	}
}
