package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_14581 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.println(
					":fan::fan::fan:\n" + 
					":fan::" + str + "::fan:\n" + 
					":fan::fan::fan:"
				);
	}
}
