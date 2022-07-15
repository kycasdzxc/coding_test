package springTest.com.crizen.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1654 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
    	int in = Integer.parseInt(st.nextToken());
    	int out = Integer.parseInt(st.nextToken());
    	
    	int[] lan = new int[in];
    	
    	long max = 0;
    	
    	for(int i = 0 ; i < in ; i++) {
    		lan[i] = Integer.parseInt(br.readLine());
    		
    		if(max < lan[i]) {
    			max = lan[i];
    		}
    	}

    	max++;
    	
    	long min = 0;
    	long mid = 0;
    	
    	while(min < max) {
    		long cnt = 0;
    		mid = (max + min) / 2;
    		
    		for(int i = 0 ; i < lan.length ; i++) {
    			cnt += lan[i] / mid;
    		}
    		
    		if(cnt < out) {
    			max = mid;
    		} else {
    			min = mid + 1;
    		}
    	}
    	br.close();
    	System.out.println(min - 1);
	}
}
