package springTest.com.crizen.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ_1929 {
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    	
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		for( ; a <= b ; a++) {
			boolean flag = true;
			
			if(a == 1) {
				continue;
			}
			
			for(int j = 2 ; j <= Math.sqrt(a) ; j++) {
				if(a % j == 0) {
					flag = false;
					break;
				}
			}
			if(flag) {
				bw.write(a + "\n");
			}
		}
		bw.flush();
		
		br.close();
		bw.close();
	}
}
