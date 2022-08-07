package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_4999 {
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
		String x = br.readLine();
		String y = br.readLine();
		
		System.out.println(x.length() >= y.length() ? "go" : "no");
    	br.close();
	}
}
