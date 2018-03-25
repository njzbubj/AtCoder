package ex2_3_3.ABC015_D;

import java.util.Scanner;

public class Main {
	static int W;
	static int N;
	static int K;
	static int A[];
	static int B[];
	static int ans;
	static int dp[][][];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		W = sc.nextInt();
		N = sc.nextInt();
		K = sc.nextInt();
		A = new int[N];
		B = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
		}
		dp = new int[N + 1][W + 1][K + 1];
		for (int i = 0; i < N + 1; i++) {
			for (int j = 0; j < W + 1; j++) {
				for (int k = 0; k < K + 1; k++) {
					dp[i][j][k] = -1;
				}
			}
		}

		ans = rec(0, W, 0);
		System.out.println(ans);
	}

	public static int rec(int i, int j, int k) {
		// i番目以降から選び、残り幅j、使用数kのときの最大価値
		ans = 0;
		if (i == N) {
			return 0;
		} else if (k == K) {
			return 0;
		}

		if (dp[i][j][k] != -1) {
			return dp[i][j][k];
		} else if (A[i] > j) {
			return dp[i][j][k] = rec(i + 1, j, k);
		} else {
			return dp[i][j][k] = Math.max(rec(i + 1, j - A[i], k + 1) + B[i], rec(i + 1, j, k));
		}
	}
}
