package exam;

import java.util.Scanner;

public class Exam_109 {
	public static void main(String[] args) {
		// 9. 숫자만 추출
		Scanner sc = new Scanner(System.in);
		System.out.println(Integer.parseInt(checkedNumber(sc.nextLine())));
		sc.close();
	}
	
	private static String checkedNumber(String str) {
		String result = "";
		
		for(int i = 0 ; i < str.length() ; i++) {
			if(Character.isDigit(str.charAt(i))) {
				result += str.charAt(i);
			}
		}
		return result;
	}
}
