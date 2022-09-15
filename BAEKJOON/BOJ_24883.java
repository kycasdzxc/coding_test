package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_24883 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().toUpperCase();
		
		if(str.equals("N")) {
			System.out.println("Naver D2");
		} else {
			System.out.println("Naver Whale");
		}
	}
}
