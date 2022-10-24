package boj;

import java.math.BigInteger;
import java.util.Scanner;

public class BOJ_1252 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String b1 = sc.next();
		String b2 = sc.next();
		
		BigInteger B1 = new BigInteger(b1, 2);
		BigInteger B2 = new BigInteger(b2, 2);
		
		sc.close();
		System.out.println(B1.add(B2).toString(2));
	}
}
