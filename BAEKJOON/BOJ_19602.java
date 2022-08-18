package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_19602 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int s = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		int l = Integer.parseInt(br.readLine());
		
		System.out.println(s + m*2 + l*3 >= 10 ? "happy" : "sad");
	}
}
