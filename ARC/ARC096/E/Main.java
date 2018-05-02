package ARC096.E;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int R = sc.nextInt();
		int r[] = new int[R];
		int A[] = new int[M];
		int B[] = new int[M];
		int C[] = new int[M];
		for (int i = 0; i < R; i++) {
			r[i] = sc.nextInt();
		}
		for (int i = 0; i < M; i++) {
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
			C[i] = sc.nextInt();
		}

		int ans = 0;

		System.out.println(ans);
	}
}
