package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_10828 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int num = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i = 0 ; i < num ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int push = 0;
			
			switch(st.nextToken()) {
			
			case "push":
				push = Integer.parseInt(st.nextToken());
				stack.add(push);
				break;
				
			case "pop":
				if(!stack.isEmpty()) {
					System.out.println(stack.pop());
				} else {
					System.out.println("-1");
				}
				break;
				
			case "size":
					System.out.println(stack.size());
				break;
			
			case "empty":
				if(stack.isEmpty()) {
					System.out.println("1");
				} else {
					System.out.println("0");
				}
				break;
			
			case "top":
				if(!stack.isEmpty()) {
					System.out.println(stack.peek());
				} else {
					System.out.println("-1");
				}
				break;
			}
		}
	}
}
