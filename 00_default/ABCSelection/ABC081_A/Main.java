package ABCSelection.ABC081_A;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char c[] = s.toCharArray();
		int ans = 0;
		for (int i = 0; i < c.length; i++) {
			if (c[i] == '1') {
				ans++;
			}
		}

		System.out.println(ans);
	}
}
