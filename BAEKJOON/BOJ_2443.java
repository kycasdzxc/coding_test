package springTest.com.crizen.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2443 {
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int num = Integer.parseInt(br.readLine());
    	
    	for(int i = 0 ; i < num ; i++) {
    		for(int j = 1 ; j <= 2 * num - 1; j++) {
    			if(i < j && j <= 2 * num - 1 - i) {
    				System.out.print("*");
    			}
    			else if(2 * num - 1 - i < j) {
    				break;
    			}
    			else {
    				System.out.print(" ");
    			}
    		}
    		System.out.println();
    	}
    	br.close();
	}
}
