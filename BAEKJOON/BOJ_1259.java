package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1259 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num = "";
		
		while(true) {
			num = br.readLine();
			boolean flag = false;
			
			if(num.equals("0")) {
				break;
			}
			
			for(int i = 0 ; i < num.length() / 2 ; i++) {
				if(num.charAt(i) != num.charAt(num.length() - 1 - i)) {
					flag = true;
				}
			}
			
			if(!flag) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}
}
