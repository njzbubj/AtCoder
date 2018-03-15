package APC001.D;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static ArrayList<Integer> linkList[];
	public static int visit[];
	public static int a[];
	public static int min = Integer.MAX_VALUE;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 要素の入力、格納
		int N = sc.nextInt();
		int M = sc.nextInt();
		a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		linkList = new ArrayList[N];
		visit = new int[N];
		for (int i = 0; i < N; i++) {
			visit[i] = 0;
			linkList[i] = new ArrayList<Integer>();
		}
		for (int i = 0; i < M; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			linkList[x].add(y);
			linkList[y].add(x);
		}
		int ans1 = 0;
		String ans2 = "Impossible";

		for (int i = 0; i < N; i++) {
			if (visit[i] == 0) {
				min = dfs(i);
			}
		}

		// 出力
		System.out.println(ans2);
	}

	public static int dfs(int i) {
		if (visit[i] == 0) {
			visit[i] = 1;
			min = Math.min(min, a[i]);
			for (int j = 0; j < linkList[i].size(); j++) {
				if (visit[linkList[i].get(j)] == 0) {
					dfs(linkList[i].get(j));
				}
			}
		}
		return min;
	}
}
