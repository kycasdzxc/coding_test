package exam;

import java.util.Scanner;

public class Exam4 {
	public static void main(String[] args) {
		// 4. 단어 뒤집기(StringBuilder 이용법 또는 직접뒤집기)
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		
		int cnt = Integer.parseInt(sc.nextLine());
		
		for(int i = 0 ; i < cnt ; i++) {
			String str = sc.nextLine();
			
			for(int j = str.length() ; 0 < j ; j--) {
				sb.append(str.charAt(j - 1));
			}
			
			sb.append("\n");
		}
		sc.close();
		System.out.println(sb);
	}
}
