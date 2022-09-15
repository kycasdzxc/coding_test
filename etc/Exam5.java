package exam;

import java.util.Scanner;

public class Exam5 {
	public static void main(String[] args) {
		// 5. 특정 문자 뒤집기(toCharArray())
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		char[] chars = str.toCharArray();
		
		int last; // 끝 글자 index
		char tmp; // 담아둘 공간
		
		for(int i = 0 ; i < chars.length / 2 ; i++) {
			if(checkedAlpabet(chars[i])) {
				last = chars.length - 1 - i;
				
				tmp = chars[i];
				chars[i] = chars[last];
				chars[last] = tmp;
			}
		}
		sc.close();
		System.out.println(new String(chars));
	}
	
	private static boolean checkedAlpabet(char c) {
		if((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
			return true;
		}
		return false;
	}
}
