package ABCSelection.ABC086_A;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String ans = "";
		if (a * b % 2 == 0) {
			ans = "Even";
		} else {
			ans = "Odd";
		}

		System.out.println(ans);
	}
}
