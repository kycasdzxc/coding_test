package springTest.com.crizen.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2444 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int cnt = Integer.parseInt(br.readLine()) - 1;
    	
		for (int i = - cnt ; i <= cnt ; i++) {
			for (int j = - cnt ; j <= cnt ; j++) {
				if (Math.abs(i) + Math.abs(j) <= cnt) {
					System.out.print("*");
				}
				else if(Math.abs(i) - j < cnt) {
					break;
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
