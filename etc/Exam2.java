package exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam2 {
	public static void main(String[] args) throws IOException {
		// 2. 대소문자 변환
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		String result = "";
		
		for(int i = 0 ; i < str.length() ; i++) {
			result += str.charAt(i) >= 65 && str.charAt(i) <= 90 ? (char)(str.charAt(i) + 32) : (char)(str.charAt(i) - 32);
		}
		
		System.out.println(result);
	}
}
