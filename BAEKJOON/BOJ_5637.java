package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_5637 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		int max = 0;
		String result = "";
		
		while(true) {
			str = str.toLowerCase();
			for(int i = 0 ; i < str.length() ; i++) {
				if(!((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || str.charAt(i) == '-')) {
					str = str.replace(str.charAt(i), ' ');
				}
			}

			String[] strs = str.split(" ");
			
			for(int i = 0 ; i < strs.length ; i++) {
				if(max < strs[i].length() && !strs[i].equals("E-N-D")) {
					max = strs[i].length();
					result = strs[i];
				}
			}
			if(str.contains("e-n-d")) {
				break;
			}
			str = br.readLine();
		}
		System.out.println(result.toLowerCase());
	}
}
