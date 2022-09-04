package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BOJ_10866 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int num = Integer.parseInt(br.readLine());
		Deque<Integer> deque = new LinkedList<Integer>();
		
		for(int i = 0 ; i < num ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int push = 0;
			
			switch(st.nextToken()) {
			
			case "push_front":
				push = Integer.parseInt(st.nextToken());
				deque.addFirst(push);
				break;
				
			case "push_back":
				push = Integer.parseInt(st.nextToken());
				deque.addLast(push);
				break;
				
			case "pop_front":
				if(!deque.isEmpty()) {
					System.out.println(deque.pollFirst());
				} else {
					System.out.println("-1");
				}
				break;
			
			case "pop_back":
				if(!deque.isEmpty()) {
					System.out.println(deque.pollLast());
				} else {
					System.out.println("-1");
				}
				break;
			
			case "size":
				System.out.println(deque.size());
				break;
			
			case "empty":
				if(deque.isEmpty()) {
					System.out.println("1");
				} else {
					System.out.println("0");
				}
				break;
			
			case "front":
				if(!deque.isEmpty()) {
					System.out.println(deque.getFirst());
				} else {
					System.out.println("-1");
				}
				break;
			
			case "back":
				if(!deque.isEmpty()) {
					System.out.println(deque.getLast());
				} else {
					System.out.println("-1");
				}
				break;
			}
		}
	}
}
