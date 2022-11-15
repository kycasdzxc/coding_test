package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BOJ_7696 {
	static List<Integer> repeat = new ArrayList<Integer>();
	
	static {
		List<String> li;
		int cnt = 1;
		boolean flag = true;
		
		for(int i = 0 ; i < 1000000 ; i++) {
			if(cnt > 9) {
				while(true) {
					flag = true;
					
					li = Arrays.asList((cnt + "").split(""));
					
					if(li.size() != li.stream().distinct().count()) {
						flag = false;
						cnt++;
					}
					
					if(flag) {
						repeat.add(cnt++);
						break;
					}
				}
			} else {
				repeat.add(cnt++);
			}
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		while(num != 0) {
			System.out.println(repeat.get(num-1));
			
			num = Integer.parseInt(br.readLine());
		}
	}
}