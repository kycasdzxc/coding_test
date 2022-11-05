package boj;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class BOJ_2052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		
		BigInteger integer = new BigInteger("2").pow(cnt);
		
		BigDecimal decimal = new BigDecimal(1d).divide(new BigDecimal(integer));
		
		System.out.println(decimal.toPlainString());
		sc.close();
	}
}
