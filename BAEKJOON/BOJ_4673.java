package boj;

public class BOJ_4673 {
	
	public static void main(String[] args) {
		selfNum(10000);
	}
	
	private static void selfNum(int num) {
		for(int i = 1 ; i <= num ; i++) {
			boolean flag = false;
			
			for(int j = 0 ; j < i ; j++) {
				int x = j;
				int sum = x;
				
				while(x != 0) {
					sum += x % 10;
					x /= 10;
				}
				
				if(i == sum) {
					flag = true;
					break;
				}
				
//				int a = 0; // 1번자리
//				int b = 0; // 2번자리
//				int c = 0; // 3번자리
//				int d = 0; // 4번자리
//				
//				if(j < 10) { // 1의 자리
//					a = j;
//				}
//
//				else if(j < 100) { // 10의 자리
//					a = j / 10;
//					b = j % 10;
//				}
//				
//				else if(j < 1000) { // 100의 자리
//					a = j / 100;
//					b = j % 100 / 10;
//					c = j % 10;
//				}
//				else { // 1000의 자리
//					a = j / 1000;
//					b = j % 1000 / 100;
//					c = j % 100 / 10;
//					d = j % 10;
//				}
//				
//				if(i == j + a + b + c + d) {
//					flag = true;
//					break;
//				}
			}
			if(!flag) {
				System.out.println(i);
			}
		}
	}
}
