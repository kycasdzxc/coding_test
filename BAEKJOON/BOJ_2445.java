package springTest.com.crizen.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2445 {
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int cnt = Integer.parseInt(br.readLine());
    	
		for (int i = 1 ; i < 2 * cnt ; i++) {
			for (int j = 1; j <= 2 * cnt ; j++) {
				if ((i - j >= 0 || i + j > 2 * cnt) && (i + j <= 2 * cnt || j - i > 0)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
    	br.close();
	}
}
