package springTest.com.crizen.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ_2920 {
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    	
    	Integer[] code = new Integer[8];

		for (int i = 0 ; i < 8 ; i++) {
			int x = Integer.parseInt(st.nextToken());
			code[i] = x;
		}
		
		Integer[] asc = code.clone();
		Integer[] desc = code.clone();

		Arrays.sort(asc);
		Arrays.sort(desc, Collections.reverseOrder());
		
		
		if(Arrays.equals(code, asc)) {
			System.out.println("ascending");
		}
		else if(Arrays.equals(code, desc)) {
			System.out.println("descending");
		} else {
			System.out.println("mixed");
		}
		
    	br.close();
	}
}
