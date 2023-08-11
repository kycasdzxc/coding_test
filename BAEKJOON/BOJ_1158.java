package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1158 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int total = Integer.parseInt(st.nextToken());
		int cnt = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		for(int i = 0 ; i < total ; i++) {
			queue.offer(i + 1);
		}
		
		while(queue.size() != 1) {
			for(int i = 0 ; i < cnt - 1 ; i++) {
				queue.offer(queue.poll());
			}
			sb.append(queue.poll()).append(", ");
		}
		sb.append(queue.poll());
		
		// 리스트로 하드코딩
//		List<String> nums = new ArrayList<String>();
//		
//		for(int i = 0 ; i < total ; i++) {
//			nums.add(i + "");
//		}
//		
//		int idx = 0;
//		
//		while(nums.size() > 0) {
//			idx += cnt - 1;
//			
//			while(total <= idx) {
//				idx -= total;
//			}
//			
//			sb.append(Integer.parseInt(nums.get(idx)) + 1);
//			nums.remove(idx);
//			total--;
//			
//			if(nums.size() > 0) {
//				sb.append(", ");
//			}
//		}
		
		sb.append(">");
		
		System.out.println(sb.toString());
	}
}
