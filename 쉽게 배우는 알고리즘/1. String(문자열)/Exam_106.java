package exam;

import java.util.Scanner;

public class Exam_106 {
	public static void main(String[] args) {
		// 6. 중복문자제거
		Scanner sc = new Scanner(System.in);
		System.out.println(removeDuplicate(sc.nextLine()));
		sc.close();
	}
	
	private static String removeDuplicate(String str) {
		String result = "";
		while(str.length() > 0) {
			result += str.charAt(0);
			str = str.replace(str.substring(0, 1), "");
		}
		return result;
	}
}
