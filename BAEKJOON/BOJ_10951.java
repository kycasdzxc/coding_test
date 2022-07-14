package springTest.com.crizen.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10951 {
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	try {
    		while(true) {
    			st = new StringTokenizer(br.readLine(), " ");
    			System.out.println(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
    		}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
