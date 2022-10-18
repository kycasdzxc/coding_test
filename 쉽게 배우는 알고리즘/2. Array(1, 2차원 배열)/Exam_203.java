package exam;

import java.util.Scanner;

public class Exam_203 {
	public static void main(String[] args) {
		// 3. 가위 바위 보
		Scanner sc = new Scanner(System.in);
		
		int num = Integer.parseInt(sc.nextLine());
		
		int[] a = new int[num];
		int[] b = new int[num];
		
		for(int i = 0 ; i < num ; i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0 ; i < num ; i++) {
			b[i] = sc.nextInt();
		}
		
		score(a, b);
		
		sc.close();
	}
	
	private static void score(int[] a, int[] b) {
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0 ; i < a.length ; i++) {
			if(a[i] == b[i]) {
				sb.append("D\n");
			}
			else if(b[i] - a[i] == 1 || (a[i] == 3 && b[i] == 1)) {
				sb.append("B\n");
			}
			else {
				sb.append("A\n");
			}
		}
		System.out.println(sb.toString());
	}
	
}
