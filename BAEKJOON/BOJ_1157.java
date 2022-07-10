package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Arrays;

public class BOJ_1157 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[26];
		int max = -1;
		char ch = '?';
		
		String input = br.readLine().toUpperCase();
		
		for(int i = 0 ; i < input.length() ; i++) {
			arr[input.charAt(i) - 'A']++;
		}
		
		for(int i = 0 ; i < 26 ; i++) {
			if(arr[i] > max) {
				max = arr[i];
				ch = (char)(i + 65);
			}
			else if(arr[i] == max) {
				ch = '?';
			}
		}
		br.close();
		System.out.println(ch);
	}
	
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		String input = br.readLine().toUpperCase();
//		int maxCnt = 0;
//		String result = "";
//		
//		char[] strToChar = input.toCharArray();
//		Arrays.sort(strToChar);
//		
//		input = new String(strToChar);
//
//		for(int i = 0 ; i < input.length() ; i++) {
//				char x = input.charAt(i);
//				int cnt = 0;
//				
//				for(int j = 0 ; j < input.length() ; j++) {
//					if(x == input.charAt(j)) {
//						cnt++;
//					}
//				}
//				
//				if(cnt > maxCnt) {
//					maxCnt = cnt;
//					result = x + "";
//				}
//				else if(maxCnt == cnt) {
//					result = "?";
//				}
//				 
//				i = input.lastIndexOf(x) + 1;
//			}
//		br.close();
//		
//		System.out.println(result);
//	}
}
