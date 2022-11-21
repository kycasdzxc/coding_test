package boj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BOJ_1038 {
	
	static ArrayList<Long> list;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = Integer.parseInt(sc.nextLine());
		list = new ArrayList<Long>();
		
		if(num <= 10) {
			System.out.println(num);
		}
		else if(num > 1022) {
			System.out.println("-1");
		}
		else {
			for(int i = 0 ; i < 10 ; i++) {
				bp(i, 1);
			}
			Collections.sort(list);
			
			System.out.println(list.get(num));
		}
		sc.close();
	}
	
	public static void bp(long num, int idx) {
		if(idx > 10) {
			return;
		}
		
		list.add(num);
		
		for(int i = 0 ; i < num % 10 ; i++) {
			bp((num*10) + i, idx + 1);
		}
	}
}
