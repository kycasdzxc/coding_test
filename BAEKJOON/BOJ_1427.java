package boj;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_1427 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String num = sc.nextLine();
		char[] chars = num.toCharArray();
		
		Arrays.sort(chars);
		
		System.out.println(new StringBuilder(String.valueOf(chars)).reverse());
		
		sc.close();
	}
}
