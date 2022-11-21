package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BOJ_1235 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		String[] strs = new String[num];
		
		for(int i = 0 ; i < num ; i++) {
			strs[i] = br.readLine();
		}
		
		int length = strs[0].length();
		
		for(int i = 0 ; i < length ; i++) {
			List<String> list = new ArrayList<String>();
			
			for(int j = 0 ; j < num ; j++) {
				String tmp = strs[j];
				tmp = tmp.substring(length - i - 1, length);
				
				if(!list.contains(tmp)) {
					list.add(tmp);
				} else {
					break;
				}
			}
			
			if(num == list.size()) {
				System.out.println(i + 1);
				break;
			}
		}
	}
}
