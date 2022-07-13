package springTest.com.crizen.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_9020 {
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int cnt = Integer.parseInt(br.readLine());
    	
    	boolean[] prime = new boolean[10000 + 1];
    	
    	prime[0] = prime[1] = false;
    	
    	for(int i = 2 ; i <= Math.sqrt(prime.length) ; i++) {
    		if(prime[i] == true) {
    			continue;
    		}
    		for(int j = i * i ; j < prime.length ; j = j + i) {
    			prime[j] = true;
    		}
    	}
    	
    	for(int i = 0 ; i < cnt ; i++) {
    		int num = Integer.parseInt(br.readLine());
    		
    		int x = 0;
    		int y = 0;
    		
    		for(int j = 2 ; j <= num / 2 ; j++) {
    			if(!prime[j]) {
    				if(!prime[num - j]) {
    					if(x == 0) {
    						x = num - j;
	    					y = j;
    					}
    					else if(Math.abs(num - 2 * j) < x - y) {
	    					x = num - j;
	    					y = j;
    					}
    				}
    			}
    		}
    		System.out.println(y + " " + x);
    	}
		br.close();
		bw.close();
	}
}
