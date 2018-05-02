package ARC095.E;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static char[][] c;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		c = new char[H][W];
		for (int i = 0; i < H; i++) {
			c[i] = sc.next().toCharArray();
		}
		String ans = "Yes";

		char tmp[] = new char[W];
		boolean a[] = new boolean[H];
		for (int i = 0; i < H; i++) {
			if (a[i]) {
				continue;
			}
			for (int j = 0; j < H; j++) {
				if (i == j) {
					continue;
				}
				if (a[j]) {
					continue;
				}
				for (int k = 0; k < W; k++) {
					tmp[k] = c[j][k];
				}
				for (int k = 0; k < W; k++) {

					a[i] = true;
					a[j] = true;
					if (!Arrays.asList(tmp).contains(c[i][k])) {

						a[i] = false;
						a[j] = false;
						break;
					}
				}
			}
		}
		char tmp2[] = new char[H];
		boolean a2[] = new boolean[W];
		for (int i = 0; i < W; i++) {
			if (a2[i]) {
				continue;
			}
			for (int j = 0; j < W; j++) {
				if (i == j) {
					continue;
				}
				if (a2[j]) {
					continue;
				}
				for (int k = 0; k < H; k++) {
					tmp2[k] = c[k][j];
				}
				for (int k = 0; k < H; k++) {
					a2[i] = true;
					a2[j] = true;
					if (!Arrays.asList(tmp2).contains(c[k][i])) {
						a2[i] = false;
						a2[j] = false;
						break;
					}
				}

			}
		}

		for (int i = 0; i < H; i++) {
			if (!a[i]) {
				ans = "No";
				break;
			}
		}
		if (ans.equals("Yes")) {
			for (int i = 0; i < W; i++) {
				if (!a2[i]) {
					ans = "No";
					break;
				}
			}
		}
		System.out.println(ans);
	}
}
