package exam;

import java.util.Scanner;

public class Exam_205 {
	public static void main(String[] args) {
		// 5. 소수(에라토스테네스 체)
		Scanner sc = new Scanner(System.in);
		
		int num = Integer.parseInt(sc.nextLine());
		
		System.out.println(eratos(num));
		System.out.println(solution(num));
		sc.close();
	}
	
	private static int eratos(int num) {
		// 0과 1은 소수가 아님
		if(num < 2) { return 0; }
		
		// 0부터 num까지의 배열 생성
		boolean[] nums = new boolean[num + 1];
		
		// 0과 1을 true로 초기화. false는 소수, true는 소수가 아닌 수
			nums[0] = nums[1] = true;
		
		// 소수 개수 카운트
		int cnt = 0;
		
		/*	에라토스테네스의 체에 맞게 소수를 구함
		 *	1) nums[i]가 true이면 i 이후의 i 배수는 약수로 i를 가지고 있는 것이 되므로 i 이후의 i 배수에 대해 false값을 준다.
		 *	2) nums[i]가 false이면 i는 이미 소수가 아니므로 i의 배수 역시 소수가 아니게 된다. 그러므로 검사할 필요도 없다.
		 *	3) i*k (k < i)까지는 이미 검사되었으므로 j의 시작 값은 i*2에서 i*i로 개선할 수 있다.
		 */
		for(int i = 2 ; i < num ; i++) {
			if(!nums[i]) {
				for(int j = i * i ; j <= num ; j += i) {
					nums[j] = true;
				}
				cnt++;
			}
		}
		return cnt;
	}
	
	private static int solution(int num) {
		
		if(num < 2) { return 0; }
		
		boolean[] nums = new boolean[num + 1];
		
		nums[0] = nums[1] = true;
		
		int cnt = 0;
		
		for(int i = 2 ; i < num ; i++) {
			if(!nums[i]) {
				for(int j = i ; j <= num ; j += i) {
					nums[j] = true;
				}
				cnt++;
			}
		}
		return cnt;
	}
	
}
