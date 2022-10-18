package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_5622 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String num = br.readLine();
		int second = 0;
		
		for(int i = 0 ; i < num.length() ; i++) {
			int tmp = num.charAt(i);
			
			if(tmp <= 'C')  {
				second += 3;
			}
			else if (tmp <= 'F') {
				second += 4;
			}
			else if (tmp <= 'I') {
				second += 5;
			}
			else if (tmp <= 'L') {
				second += 6;
			}
			else if (tmp <= 'O') {
				second += 7;
			}
			else if (tmp <= 'S') {
				second += 8;
			}
			else if (tmp <= 'V') {
				second += 9;
			}
			else {
				second += 10;
			}
		}
		System.out.println(second);
	}
}
