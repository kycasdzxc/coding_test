package springTest.com.crizen.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_11653 {
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int num = Integer.parseInt(br.readLine());
    	
    	boolean[] prime = new boolean[10_000_000 + 1];
    	
    	prime[0] = prime[1] = false;
    	
    	for(int i = 2 ; i <= Math.sqrt(prime.length) ; i++) {
    		if(prime[i] == true) {
    			continue;
    		}
    		for(int j = i * i ; j < prime.length ; j = j + i) {
    			prime[j] = true;
    		}
    	}
    	
    	for(int i = 2 ; i <= num ; i++) {
    		while(num % i == 0) {
    			System.out.println(i);
    			num = num / i;
    		}
    	}
    	
		br.close();
		bw.close();
	}
}
