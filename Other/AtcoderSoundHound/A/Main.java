package AtcoderSoundHound.A;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 要素の入力、格納
		String X = sc.next();
		String Y = sc.next();
		String ans = "NO";

		if (X.substring(0, 1).equals("S") && Y.substring(0, 1).equals("H")) {
			ans = "YES";
		}

		// 出力
		System.out.println(ans);
	}
}
