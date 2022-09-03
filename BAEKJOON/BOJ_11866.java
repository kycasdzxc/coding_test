package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_11866 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int num = Integer.parseInt(st.nextToken());
		int die = Integer.parseInt(st.nextToken());
		
		Queue<Integer> circle = new LinkedList<Integer>();
		
		for(int i = 1 ; i <= num ; i++) {
			circle.offer(i);
		}
		
		bw.append("<");
		
		for(int i = 1 ; i < num ; i++) {
			for(int j = 1 ; j < die ; j++) {
				circle.offer(circle.poll());
			}
			bw.append(circle.poll() + ", ");
		}
		bw.append(circle.poll() + ">");
		bw.flush();
	}
}
