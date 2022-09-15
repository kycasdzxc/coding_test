package exam;

import java.util.Scanner;

public class Exam_107 {
	public static void main(String[] args) {
		// 7. 회문 문자열
		Scanner sc = new Scanner(System.in);
		System.out.println(checkedPalindrome(sc.nextLine()) ? "YES" : "NO");
		sc.close();
	}
	
	private static boolean checkedPalindrome(String str) {
		boolean flag = true;
		str = str.toUpperCase();
		
		for(int i = 0 ; i < str.length() / 2 ; i++) {
			if(str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				flag = false;
				break;
			}
		}
		return flag;
	}
}
