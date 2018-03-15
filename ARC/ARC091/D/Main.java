package ARC091.D;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int K = sc.nextInt();
		long ans = 0;

		for (int i = K + 1; i <= N; i++) {
			ans += N / i * (i - K);
			if (N % i != 0 && N % i >= K) {
				ans += (N % i) - K + 1;
			}
		}

		// 出力
		System.out.println(ans);
	}
}
