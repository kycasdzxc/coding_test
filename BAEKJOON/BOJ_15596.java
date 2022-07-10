package boj;

public class BOJ_15596 {
	public long sum(int[] a) {
		int sum = 0;
		
		for(int i = 0 ; i < a.length ; i++) {
			sum += a[i];
		}
		return sum;
	}
}
