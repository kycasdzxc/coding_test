package springTest.com.crizen.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2441 {
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int num = Integer.parseInt(br.readLine());
    	
    	for(int i = 0 ; i < num ; i++) {
    		for(int j = 0 ; j < num ; j++) {
    			if(i > j) {
    				System.out.print(" ");
    			} else {
    				System.out.print("*");
    			}
    		}
    		System.out.println();
    	}
    	br.close();
	}
}
