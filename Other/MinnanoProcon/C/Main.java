package MinnanoProcon.C;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 要素の入力、格納
		int N = sc.nextInt();
		long x[] = new long[N];
		long c[] = new long[N];
		long v[] = new long[N];
		for (int i = 0; i < N; i++) {
			x[i] = sc.nextLong();
			c[i] = sc.nextLong();
			v[i] = sc.nextLong();
		}
		int ans = 0;

//		long money[] = new long[Long.MAX_VALUE];
		// 出力
		System.out.println(ans);
	}
}
