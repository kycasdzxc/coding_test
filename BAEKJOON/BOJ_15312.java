package boj;

import java.util.Scanner;

public class BOJ_15312 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] alpabet = {3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};
		
		String first = sc.nextLine();
		String second = sc.nextLine();
		
		int[] arr = new int[first.length() + second.length()];
		 
        for (int i = 0; i < arr.length - 1; i = i + 2) {
        	arr[i]   = alpabet[first.charAt(i/2) - 65];
            arr[i+1] = alpabet[second.charAt(i/2) - 65];
        }
        
        int size = arr.length;
        while (size > 2) {
            for (int i = 0; i < size-1; i++) {
            	arr[i] = (arr[i] + arr[i+1]) % 10;
            }
            arr[--size] = 0;
        }

        System.out.println(String.valueOf(arr[0])+String.valueOf(arr[1]));
		sc.close();
	}
}
