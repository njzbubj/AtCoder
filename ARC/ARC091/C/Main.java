package ARC091.C;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		long N = sc.nextLong();
		long M = sc.nextLong();
		long ans = 0;

		if (N == 1 && M == 1) {
			ans = 1;
		} else if (N == 1) {
			ans = M - 2;
		} else if (M == 1) {
			ans = N - 2;
		} else {
			ans = (N - 2) * (M - 2);
		}

		// 出力
		System.out.println(ans);
	}
}
