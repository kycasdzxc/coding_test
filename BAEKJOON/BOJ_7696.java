package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BOJ_7696 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] repeat = new int[1000000];
		int cnt = 1;
		
//		List<String> li = new ArrayList<String>(Arrays.asList(str3.split("")));
//		System.out.println(li.stream().distinct().count());
		
		for(int i = 0 ; i < repeat.length ; i++) {
			if(cnt > 9) {
				while(true) {
					String tmp = cnt + "";
					boolean flag = true;
					
					for(int j = 0 ; j < tmp.length() ; j++) {
						if(tmp.length() - tmp.replace(String.valueOf(tmp.charAt(j)), "").length() != 1) {
							flag = false;
							cnt++;
							break;
						}
					}
					
					if(flag) {
						repeat[i] = cnt++;
						break;
					}
				}
			} else {
				repeat[i] = cnt++;
			}
		}
		
		int num = Integer.parseInt(br.readLine());
		
		while(num != 0) {
			System.out.println(repeat[num-1]);
			
			num = Integer.parseInt(br.readLine());
		}
	}
}