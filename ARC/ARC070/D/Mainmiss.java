package ARC070.D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Mainmiss {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		Integer[] a = new Integer[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);

		List ans = new ArrayList<>();
		int suma = 0; // 大きい方からの合計
		int sumb = 0; // 残りの合計
		int numa = 1; // 大きい方からKを超えるのに必要な個数

		for (int i = 0; i < N; i++) {
			suma += a[N - 1 - i];
			if (K < suma) {
				for (int j = 0; j < N - 1 - i; j++) {
					sumb += a[j];
				}
				break;
			}
			numa++;
		}

		if (numa > N) {
			// 全ての合計がKに満たないケース
			ans = Arrays.asList(a);
		} else if (numa == 1) {
			// 最大数のみでKを超えるケース
			if (sumb < K) {
				// 残りの合計がK未満であれば最大値は必要
				ans.add(a[N - 1]);
			}
		} else {
			// 最大値から2個以上必要となるケース
			for (int i = 0; i < numa; i++) {
				if (a[N - 1 - i] < sumb) {
					// 最大値から順に残り合計と比較、残り合計の方が大きければ以降は不要な数
					for (int j = 0; j < numa - i; j++) {
						// 不要な数の格納
						ans.add(a[N - 1 - i + j]);
						break;
					}
					break;
				}
			}
			if(ans.size()==0){
				// 最大値からのnuma個以外は不要な数
				for(int i=0;i<N-numa;i++){
					ans.add(a[i]);
				}
			}
		}

		// 出力
		for (int i = 0; i < ans.size(); i++) {
			System.out.println(ans.get(i));
		}
	}
}
