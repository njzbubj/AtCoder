package ARC092.D;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		// 整数の入力
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

		// 出力
		System.out.println(ans);
	}
}
