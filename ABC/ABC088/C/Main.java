package ABC088.C;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 要素の入力、格納
		int c[] = new int[9];
		for (int i = 0; i < 9; i++) {
			c[i] = sc.nextInt();
		}
		String ans = "No";

		if (c[0] - c[3] == c[3] - c[6] && c[3] - c[6] == c[6] - c[0] && c[1] - c[4] == c[4] - c[7]
				&& c[4] - c[7] == c[7] - c[1] && c[2] - c[5] == c[5] - c[8] && c[5] - c[8] == c[8] - c[2]
				&& c[0] - c[1] == c[3] - c[4] && c[3] - c[4] == c[6] - c[7]) {

		}

		// 出力
		System.out.println(ans);
	}
}
