package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ_2164 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		Queue<Integer> deck = new LinkedList<Integer>();
		
		for(int i = 1 ; i <= num ; i++) {
			deck.offer(i);
		}
		
		while(deck.size() > 1) {
			deck.poll();
			deck.offer(deck.poll());
		}
		
		System.out.println(deck.poll());
	}
}
