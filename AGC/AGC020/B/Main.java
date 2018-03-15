package AGC020.B;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 要素の入力、格納
		int K = sc.nextInt();
		int A[] = new int[K];
		for (int i = 0; i < K; i++) {
			A[i] = sc.nextInt();
		}

		int ans = -1;

		int N =2;
		if (A[K - 1] == 2) {
			for (int i = 0; i < K; i++) {
				for (int j = 0; j < A[K]; j++) {
					N = N + j;
//					A[K-1]%N==0
				}
			}
		}
		// 出力
		System.out.println(ans);
	}
}
