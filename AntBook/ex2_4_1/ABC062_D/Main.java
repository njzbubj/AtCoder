package ex2_4_1.ABC062_D;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[3 * N];
		for (int i = 0; i < 3 * N; i++) {
			A[i] = sc.nextInt();
		}
		int ans = 0;

		PriorityQueue quefront = new PriorityQueue(N + 1);
		PriorityQueue queback = new PriorityQueue(N + 1, new MyComparator());
		int front[] = new int[N];
		int back[] = new int[N];
		System.arraycopy(A, 0, front, 0, N);
		System.arraycopy(A, 2 * N, back, 0, N);
		int sumfront = 0;
		int sumback = 0;
		int tmp[][] = new int[N + 1][2];
		for (int i = 0; i < N; i++) {
			quefront.add(front[i]);
			queback.add(back[i]);
			sumfront += front[i];
			sumback += back[i];
		}
		for (int i = N; i <= 2 * N; i++) {
			sumfront += A[i];
			quefront.add(A[i]);
			sumfront -= (int) quefront.poll();
			tmp[i - N][0] = sumfront;
		}
		for (int i = 2 * N; i >= N; i--) {
			sumback += A[i];
			queback.add(A[i]);
			sumback -= (int) queback.poll();
			tmp[i - N][1] = sumback;
		}
		for (int i = 0; i < N + 1; i++) {
			ans = Math.max(ans, tmp[i][0] - tmp[i][1]);
		}
		System.out.println(ans);
	}
}

class MyComparator implements Comparator {

	public int compare(Object obj1, Object obj2) {

		int num1 = (int) obj1;
		int num2 = (int) obj2;

		if (num1 > num2) {
			return 1;
		} else if (num1 < num2) {
			return -1;
		} else {
			return 0;
		}
	}
}