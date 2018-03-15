package ARC070.D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
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
		int suma = 0; // 小さい方からの合計
		int sumb = 0; // 残りの合計
		int numa = 0; // 小さい方からKを超えるのに必要な個数

		ArrayList<Integer> data[] = new ArrayList[N];
		ArrayList<Integer> data2[] = new ArrayList[N];
		for (int i = 0; i < N; i++) {
			data[i] = new ArrayList();
			data2[N - 1 - i] = new ArrayList();
			if (i == 0) {
				data[i].add(i);
				data[i].add(a[0]);
				data2[N - 1 - i].add(0);
				data2[N - 1 - i].add(a[N - 1 - i]);
			} else {
				data[i].addAll(data[i - 1]);
				data2[N - 1 - i].addAll(data2[N - i]);
				for (int j = 0; j < data[i - 1].size(); j++) {
					data[i].add(data[i - 1].get(j) + i + 1);
					data2[N - 1 - i].add(data[N - i].get(j) + i + 1);
				}
			}
		}

		List dota3 = new ArrayList();
		for(int i=0;i<N;i++){
			Collections.sort(data[i]);
			Collections.sort(data2[i]);
		}
		for (int i = 0; i < N; i++) {
			suma += a[i];
			if (K <= suma) {
				numa = i + 1;
				break;
			}
		}

		for (int i = 0; i < numa; i++) {
			sumb = 0;
			for (int j = 0; j < numa; j++) {
				if (j == i) {
					break;
				} else {
					sumb += a[j];
				}
			}
		}
		// 出力
		for (int i = 0; i < ans.size(); i++) {
			System.out.println(ans.get(i));
		}
	}
}
