package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1032 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		String str = br.readLine();
		char[] result = str.toCharArray();
		if(num > 1) {
			for(int i = 0 ; i < num - 1 ; i++) {
				String str2 = br.readLine();
				for(int j = 0 ; j < str2.length() ; j++) {
					if(result[j] != '?') {
						if(result[j] != str2.charAt(j)) {
							result[j] = '?';
						}
					} else {
						continue;
					}
				}
			}
		}
		System.out.println(result);
	}
}
