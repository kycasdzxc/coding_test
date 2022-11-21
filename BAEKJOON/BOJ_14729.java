package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BOJ_14729 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = Integer.parseInt(br.readLine());
		
		List<String> list = new ArrayList<String>();
		
		for(int i = 0 ; i < cnt ; i++) {
			list.add(br.readLine());
		}
		
		list = list.stream().sorted().collect(Collectors.toList());
		
		for(int i = 0 ; i < 7 ; i++) {
			System.out.println(list.get(i));
		}
	}
}
