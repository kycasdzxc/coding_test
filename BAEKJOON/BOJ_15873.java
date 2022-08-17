package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_15873 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		if(str.length() == 4) {
			System.out.println(Integer.parseInt(str.substring(0, 2)) + Integer.parseInt(str.substring(2, 4)));
		}
		else if(str.length() == 3) {
			if(Integer.parseInt(str) % 10 != 0) {
				System.out.println(Integer.parseInt(str) % 10 + Integer.parseInt(str) / 10);
			} else {
				System.out.println(Integer.parseInt(str) % 100 + Integer.parseInt(str) / 100);
			}
		} else {
			System.out.println(Integer.parseInt(str) % 10 + Integer.parseInt(str) / 10);
		}
	}
}
