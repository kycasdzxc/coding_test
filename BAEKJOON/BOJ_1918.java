package boj;

import java.util.Stack;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1918 {
	static Stack<Character> stack = new Stack<>();
	static String num = "";
	static String postfix = "";
	
	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        calcPostFix(br.readLine());
		System.out.println(postfix);
	}
	
	public static void calcPostFix(String str) {
        char[] chars = str.toCharArray();
		for(int i = 0 ; i < chars.length ; i++) {
            char c = chars[i];
            int idx = priority(c);
            
            if(idx > 0) {
                if(!"".equals(num)) {
                    postfix += num;
                    num = "";
                }

                switch (c) {
                    case '*':
        			case '/':
        			case '+':
        			case '-':
                        while(!stack.isEmpty() && priority(stack.peek()) >= idx && stack.peek() != '(') {
                            postfix += stack.pop();
                        }
                        stack.push(c);
                        break;
                    case '(':
                        stack.push(c);
                        break;
                    case ')':
                        while(!stack.isEmpty() && stack.peek() != '(') {
                            postfix += stack.pop();
                        }
                        stack.pop();
                        break;
                }
            } else {
                num += c;
			}
		}
        postfix += num;
        while(!stack.isEmpty()) {
            postfix += stack.pop();
        }
	}
	
    // 연산자 우선순위 정하기
	public static int priority(char c) {
		switch (c) {
            case '(':
            case ')': return 3;
            case '*':
			case '/': return 2;
			case '+':
			case '-': return 1;
			default : return 0;
        }
	}
}