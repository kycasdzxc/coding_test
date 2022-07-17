package boj;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class BOJ_10699 {
	public static void main(String[] args) {
		DateFormat date = new SimpleDateFormat("YYYY-MM-dd");
		
		System.out.println(date.format(System.currentTimeMillis()));
	}
}
