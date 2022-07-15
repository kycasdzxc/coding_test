package springTest.com.crizen.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1920 {
	
	public static int[] box;
	
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int num = Integer.parseInt(br.readLine());
    	box = new int[num];
    	
    	StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    	
    	for(int i = 0 ; i < num ; i++) {
    		box[i] = Integer.parseInt(st.nextToken());
    	}
    	
    	Arrays.sort(box);
    	
    	num = Integer.parseInt(br.readLine());
    	st = new StringTokenizer(br.readLine(), " ");
    	
    	for(int i = 0 ; i < num ; i++) {
    		int x = Integer.parseInt(st.nextToken());
    		System.out.println(sortBinary(x));
    	}
	}
	
	private static int sortBinary(int num) {
		int max = box.length - 1;
		int min = 0;
		
		while(min <= max) {
			int mid = (max + min) / 2;
			
			if(box[mid] > num) {
				max = mid - 1;
			}
			else if(box[mid] < num) {
				min = mid + 1;
			}
			else {
				return 1;
			}
		}
		return 0;
	}
}
