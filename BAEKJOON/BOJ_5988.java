package boj;

import java.math.BigInteger;
import java.util.Scanner;

public class BOJ_5988 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = Integer.parseInt(sc.nextLine());
		BigInteger two = new BigInteger("2");
		
		for(int i = 0 ; i < num ; i++) {
			BigInteger bi = new BigInteger(sc.nextLine());
			
			if(bi.mod(two).equals(BigInteger.ZERO)) {
				System.out.println("even");
			} else {
				System.out.println("odd");
			}
		}
		sc.close();
	}
}
