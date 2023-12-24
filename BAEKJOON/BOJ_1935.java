package boj;

import java.util.Stack;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1935 {
	static Stack<Double> stack = new Stack<>();

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
        String[] nums = new String[num];
        String str = br.readLine();

		for(int i = 0 ; i < num ; i++) {
            nums[i] = br.readLine();
        }
		
		for(int i = 0 ; i < str.length() ; i++) {
            char c = str.charAt(i);
			if(c != '*' && c != '/' && c != '+' && c != '-') {
				stack.push(Double.parseDouble(nums[c - 65]));
			} else {
				double o2 = Double.parseDouble(stack.pop().toString());
				double o1 = Double.parseDouble(stack.pop().toString());
                
				switch (c) {
				case '+':
					stack.push(o1 + o2);
					break;
				case '-':
					stack.push(o1 - o2);
					break;
				case '*':
					stack.push(o1 * o2);
					break;
				case '/':
					stack.push(o1 / o2);
					break;
				}
			}
		}
		
		System.out.printf("%.2f", stack.pop());
	}
}