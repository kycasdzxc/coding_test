package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_10816 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		// 기존의 카드덱 세팅
		int cnt = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		
		int[] deck = new int[cnt];
		
		for(int i = 0 ; i < cnt ; i++) {
			deck[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(deck);
		
		// 내 카드덱 세팅
		int cnt2 = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		
		int[] deck2 = new int[cnt2];
		
		for(int i = 0 ; i < cnt2 ; i++) {
			deck2[i] = Integer.parseInt(st.nextToken());
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0 ; i < cnt2 ; i++) {
			int lo = findLower(deck, deck2[i]);
			int hi = findUpper(deck, deck2[i]);
			
			sb.append(hi - lo).append(" ");
		}
		System.out.println(sb);
	}
	
	private static int findLower(int[] arr, int key) {
		int lo = 0;
		int hi = arr.length;
		
		while(lo < hi) {
			int mid = (lo + hi) / 2;
			
			if(key <= arr[mid]) {
				hi = mid;
			} else {
				lo = mid + 1;
			}
		}
		
		return lo;
	}
	
	private static int findUpper(int[] arr, int key) {
		int lo = 0;
		int hi = arr.length;
		
		while(lo < hi) {
			int mid = (lo + hi) / 2;
			
			if(key < arr[mid]) {
				hi = mid;
			} else {
				lo = mid + 1;
			}
		}
		
		return lo;
	}
}
