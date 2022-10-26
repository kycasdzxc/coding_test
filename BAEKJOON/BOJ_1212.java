package boj;

import java.math.BigInteger;
import java.util.Scanner;

public class BOJ_1212 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BigInteger result = new BigInteger(sc.nextLine(), 8);
		
		System.out.println(result.toString(2));
		sc.close();
	}
}
