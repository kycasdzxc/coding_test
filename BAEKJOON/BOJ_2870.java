package boj;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BOJ_2870 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = Integer.parseInt(sc.nextLine());
		String[] strs = new String[num];
		
		for(int i = 0 ; i < num ; i++) {
			strs[i] = sc.nextLine();
		}
		
		List<BigInteger> list = new ArrayList<BigInteger>();
		
		for(int i = 0 ; i < num ; i++) {
			String[] tmp = strs[i].split("\\D");
			
			for(int j = 0 ; j < tmp.length ; j++) {
				if(!tmp[j].equals("")) {
					list.add(new BigInteger(tmp[j]));
				}
			}
		}
		
		Collections.sort(list);
		
		for(BigInteger i : list) {
			System.out.println(i.toString());
		}
		sc.close();
	}
	
// 	NumberFormatException 발생!
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		int num = Integer.parseInt(sc.nextLine());
//		String[] strs = new String[num];
//		
//		for(int i = 0 ; i < num ; i++) {
//			strs[i] = sc.nextLine();
//		}
//		
//		List<Long> list = new ArrayList<Long>();
//		
//		for(int i = 0 ; i < num ; i++) {
//			String tmp = "";
//			
//			for(int j = 0 ; j < strs[i].length() ; j++) {
//				if(strs[i].charAt(j) >= '0' && strs[i].charAt(j) <= '9') {
//					tmp += strs[i].charAt(j);
//				} else {
//					if(tmp.length() > 0) {
//						list.add(Long.parseLong(tmp));
//						tmp ="";
//					}
//				}
//			}
//			if(tmp.length() > 0) {
//				list.add(Long.parseLong(tmp));
//			}
//		}
//		
//		Collections.sort(list);
//		
//		for(long i : list) {
//			System.out.println(i);
//		}
//		sc.close();
//	}
}
