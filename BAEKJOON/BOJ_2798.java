package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2798 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int num = Integer.parseInt(st.nextToken());
		int blackJack= Integer.parseInt(st.nextToken());
		int[] deck = new int[num];
		
		st  = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0 ; i < num ; i++) {
			deck[i] = Integer.parseInt(st.nextToken());
		}
		
		int result = 0;
		
		for(int i = 0 ; i < num - 2 ; i++) {
			for(int j = i + 1 ; j < num - 1 ; j++) {
				for(int k = j + 1 ; k < num ; k++) {
					int x = deck[i] + deck[j] + deck[k];
					if(result  < x && x <= blackJack) {
						result = deck[i] + deck[j] + deck[k];
					}
				}
			}			
		}
		System.out.println(result);
	}
}
