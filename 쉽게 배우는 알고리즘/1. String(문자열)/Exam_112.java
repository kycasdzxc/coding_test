package exam;

import java.util.Scanner;

public class Exam_112 {
	public static void main(String[] args) {
		// 12. 암호
		Scanner sc = new Scanner(System.in);
		int key = Integer.parseInt(sc.nextLine());
		String str = sc.nextLine();
		System.out.println(setDecryption(str, key));
//		System.out.println(solution(str, key));
		sc.close();
	}
	
	private static String setDecryption(String str, int length) {
		char[] password = new char[length];
		
		String word = str.charAt(0) == '#' ? "1" : "0";
		
		for(int i = 1 ; i < str.length() ; i++) {
			if(i % 7 != 0) {
				word += str.charAt(i) == '#' ? "1" : "0";
			}
			else {
				password[(i / 7) - 1] = (char)Integer.parseInt(word, 2);
				word = str.charAt(i) == '#' ? "1" : "0";
			}
		}
		password[length - 1] = (char)Integer.parseInt(word, 2);
		
		return String.valueOf(password);
	}
	
	private static String solution(String str, int length) {
		String answer = "";
		str = str.replace("#", "1").replace("*", "0");
		
		for(int i = 0 ; i < length ; i++) {
			answer += (char)Integer.parseInt(str.substring(0, 7), 2);
			str = str.substring(7);
		}
		return answer;
	}
}
