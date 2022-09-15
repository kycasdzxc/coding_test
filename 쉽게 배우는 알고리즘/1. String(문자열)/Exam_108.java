package exam;

import java.util.Scanner;

public class Exam_108 {
	public static void main(String[] args) {
		// 8. 유효한 팰린드롬
		Scanner sc = new Scanner(System.in);
		System.out.println(checkedPalindrome(sc.nextLine()) ? "YES" : "NO");
		sc.close();
	}
	
	private static boolean checkedPalindrome(String str) {
		boolean flag = true;
		int last = str.length() - 1;
		str = str.toUpperCase();
		
		for(int i = 0 ; i < str.length() ; i++) {
			if(Character.isAlphabetic(str.charAt(i))) {
				while(!Character.isAlphabetic(str.charAt(last))) {
					last--;
				}
				
				if(i > last) {
					break;
				}
				
				if(str.charAt(i) != str.charAt(last)) {
					flag = false;
					break;
				}
				last--;
			}
		}
		return flag;
	}
}
