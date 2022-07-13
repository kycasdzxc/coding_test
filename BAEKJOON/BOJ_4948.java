package springTest.com.crizen.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_4948 {
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int cnt = -1;
    	boolean[] prime = new boolean[123457 * 2];
    	
    	prime[0] = prime[1] = false;
    	
    	for(int i = 2 ; i <= Math.sqrt(prime.length) ; i++) {
    		if(prime[i] == true) {
    			continue;
    		}
    		for(int j = i * i ; j < prime.length ; j = j + i) {
    			prime[j] = true;
    		}
    	}
    	while(cnt != 0) {
    		int num = Integer.parseInt(br.readLine());
    		int check = 0;
    		
	    	if(num != 0) {
    			for(int i = num + 1; i <= prime.length ; i++) {
	    			if(i >= prime.length || i > num * 2) {
	    				break;
	    			}
	    			if(!prime[i]) {
	    				check++;
	    			}
	    		}
    			System.out.println(check);
    		}
    		cnt = num;
    	}
		br.close();
		bw.close();
	}
}
