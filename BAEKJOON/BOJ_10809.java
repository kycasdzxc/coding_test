package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_10809 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] alphabet = {
					"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
					"n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

		int[] idx = new int[26];
		String str = br.readLine();
		
		for(int i = 0 ; i < idx.length ; i++) {
			idx[i] = str.indexOf(alphabet[i]);
		}
		
		for(int i = 0 ; i < 25 ; i++) {
			bw.append(idx[i] + " ");
		}
		bw.append(idx[idx.length-1] + "");
		bw.flush();
	}
}
