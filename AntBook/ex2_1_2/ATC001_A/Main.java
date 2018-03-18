package ex2_1_2.ATC001_A;

import java.util.Scanner;

public class Main {
	static char[][] c;
	static boolean[][] reached;
	static int H;
	static int W;
	static String ans;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		H = sc.nextInt();
		W = sc.nextInt();
		c = new char[H][W];
		reached = new boolean[H][W];
		int sx = 0;
		int sy = 0;
		for (int i = 0; i < H; i++) {
			c[i] = sc.next().toCharArray();
			if (String.valueOf(c[i]).contains("s")) {
				sx = i;
				sy = String.valueOf(c[i]).indexOf("s");
			}
		}

		ans = "No";
		search(sx, sy);

		// 出力
		System.out.println(ans);
	}

	public static void search(int x, int y) {
		if (x < 0 || x > H - 1 || y < 0 || y > W - 1) {
			return;
		}
		if (c[x][y] == '#') {
			return;
		}
		if (reached[x][y]) {
			return;
		}
		if (c[x][y] == 'g') {
			ans = "Yes";
			return;
		}
		reached[x][y] = true;

		search(x + 1, y);// 右
		if (ans.equals("Yes")) {
			return;
		}
		search(x - 1, y);// 左
		if (ans.equals("Yes")) {
			return;
		}
		search(x, y + 1);// 下
		if (ans.equals("Yes")) {
			return;
		}
		search(x, y - 1);// 上
		if (ans.equals("Yes")) {
			return;
		}
	}
}