package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_20499 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strs = br.readLine().split("/");
		if(Integer.parseInt(strs[0]) + Integer.parseInt(strs[2]) < Integer.parseInt(strs[1]) || Integer.parseInt(strs[1]) == 0) {
			System.out.println("hasu");
		} else {
			System.out.println("gosu");
		}
	}
}
