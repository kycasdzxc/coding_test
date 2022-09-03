package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_10845 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int num = Integer.parseInt(br.readLine());
		
		Queue<Integer> nums = new LinkedList<Integer>();
		int push = 0;
		
		for(int i = 0 ; i < num ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			switch(st.nextToken()) {
			case "pop":
				if(nums.size() > 0) {
					bw.append(nums.poll() + "\n");
				} else {
					bw.append("-1\n");
				}
				break;
				
			case "size":
				bw.append(nums.size() + "\n");
				break;
				
			case "empty":
				if(!nums.isEmpty()) {
					bw.append("0\n");
				} else {
					bw.append("1\n");
				}
				break;
				
			case "front":
				if(!nums.isEmpty()) {
					bw.append(nums.peek() + "\n");
				} else {
					bw.append("-1\n");
				}
				break;
				
			case "back":
				if(nums.size() > 0) {
					bw.append(push + "\n");
				} else {
					bw.append("-1\n");
				}
				break;
				
			default:
				push = Integer.parseInt(st.nextToken());
				nums.add(push);
			}
		}
		bw.flush();
	}
}
