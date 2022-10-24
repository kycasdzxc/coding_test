package boj;

import java.util.Scanner;

public class BOJ_1225 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long sum = 0;
		
		String A = sc.next();

		if(!(A.equals("0"))) {
			String B = sc.next();
		
			for(int i = 0 ; i < A.length() ; i++) {
				for(int j = 0 ; j < B.length() ; j++) {
					sum += Integer.parseInt(A.charAt(i)+"") * Integer.parseInt(B.charAt(j)+"");
				}
			}
		}
		sc.close();
		System.out.println(sum);
	}
}
