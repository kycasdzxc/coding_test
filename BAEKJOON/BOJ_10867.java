package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class BOJ_10867 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = Integer.parseInt(br.readLine());
		
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0 ; i < cnt ; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		list = list.stream().distinct().sorted().collect(Collectors.toList());
		
		for(Integer i : list) {
			System.out.print(i + " ");
		}
	}
}
