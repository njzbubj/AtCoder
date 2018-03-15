package MinnanoProcon.A;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 要素の入力、格納
		String S = sc.next();
		String ans = "NO";

		if (S.substring(0, 1).equals("y") && S.substring(1, 2).equals("a") && S.substring(2, 3).equals("h")
				&& S.substring(3, 4).equals(S.substring(4, 5))) {
			ans = "YES";
		}
		// 出力
		System.out.println(ans);
	}
}
