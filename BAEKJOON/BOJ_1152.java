package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1152 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().trim();
		String[] strs = str.split(" ");
		if(strs[0].equals("")) {
			System.out.println(0);
		} else {
			System.out.println(strs.length);
		}
	}
}
