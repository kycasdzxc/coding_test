package exam;

import java.util.Scanner;

public class Exam_111 {
	public static void main(String[] args) {
		// 11. 문자열 압축
		Scanner sc = new Scanner(System.in);
		System.out.println(countAlpabet(sc.nextLine()));
//		System.out.println(solution(sc.nextLine()));
		sc.close();
	}
	
	private static String countAlpabet(String str) {
		StringBuilder sb = new StringBuilder();
		
		sb.append(str.charAt(0));
		int cnt = 0;
		
		for(int i = 1 ; i < str.length() ; i++) {
			if(str.charAt(i-1) == str.charAt(i)) {
				cnt++;
			} else {
				if(cnt > 0) { sb.append(cnt + 1); }
				
				cnt = 0;
				sb.append(str.charAt(i));
			}
		}
		
		if(cnt > 0) { sb.append(cnt + 1); }
		
		return sb.toString();
	}
	
	private static String solution(String str) {
		String answer = "";
		str += " ";

		int cnt = 1;
		
		for(int i = 0 ; i < str.length()-1 ; i++) {
			if(str.charAt(i) == str.charAt(i+1)) {
				cnt++;
			} else {
				answer += str.charAt(i);
				
				if(cnt > 1) {
					answer += cnt + "";
					cnt = 1;
				}
			}
		}
		return answer;
	}
}
