package AtcoderSoundHound.B;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 要素の入力、格納
		int n = sc.nextInt();
		int L = sc.nextInt();
		int R = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int ans = 0;

		for (int i = 0; i < n; i++) {
			if (a[i] < L) {
				ans = L;
			} else if (a[i] > R) {
				ans = R;
			} else {
				ans = a[i];
			}
			// 出力
			System.out.print(ans);
			if(i!=n-1){
				System.out.print(" ");
			}
		}
	}
}
