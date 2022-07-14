package springTest.com.crizen.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10995 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int cnt = Integer.parseInt(br.readLine());
    	
		for (int i = 0 ; i < cnt ; i++) {
			for (int j = 0 ; j < cnt * 2 ; j++) {
				if(i % 2 == 0) {
					if(j % 2 != 0) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				} else {
					if(j % 2 == 0) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
			}
			System.out.println();
		}
    	br.close();
	}
}
