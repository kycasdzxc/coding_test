package boj;

import java.util.Scanner;

public class BOJ_2941 {
	public static void main(String[] args) {
		String[] cro = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		for(String s : cro) {
			input = input.replace(s, "@");
		}
		System.out.println(input.length());
		sc.close();
	}
}
