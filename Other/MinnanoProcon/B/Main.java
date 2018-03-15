package MinnanoProcon.B;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 要素の入力、格納
		int X = sc.nextInt();
		int K = sc.nextInt();
		int Y = (int) Math.pow(10, K);
		int ans = (X / Y + 1) * Y;

		// 出力
		System.out.println(ans);
	}
}
