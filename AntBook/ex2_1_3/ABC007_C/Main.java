package ex2_1_3.ABC007_C;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

	static char[][] map;
	static boolean[][] visit;
	static int[][] tesuu;
	static int vx[] = { 0, 1, 0, -1 };
	static int vy[] = { 1, 0, -1, 0 };
	static int ans;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		int sy = sc.nextInt();
		int sx = sc.nextInt();
		int gy = sc.nextInt();
		int gx = sc.nextInt();
		map = new char[R][C];
		visit = new boolean[R][C];
		tesuu = new int[R][C];
		for (int i = 0; i < R; i++) {
			map[i] = sc.next().toCharArray();
		}
		map[sy - 1][sx - 1] = 'S';
		map[gy - 1][gx - 1] = 'G';

		bfs(sy - 1, sx - 1);

		System.out.println(ans);
	}

	public static void bfs(int sy, int sx) {
		int count = 0;
		visit[sy][sx] = true;
		tesuu[sy][sx] = 0;
		int ichi[] = { sy, sx };
		ArrayDeque que = new ArrayDeque();
		que.offer(ichi);
		while (!que.isEmpty()) {
			ichi = (int[]) que.poll();
			int nowy = ichi[0];
			int nowx = ichi[1];
			for (int i = 0; i < 4; i++) {
				int ny = nowy + vy[i];
				int nx = nowx + vx[i];
				if (map[ny][nx] == ('G')) {
					ans = tesuu[nowy][nowx] + 1;
					return;
				} else if (map[ny][nx] == ('.') && !visit[ny][nx]) {
					int ichi2[] = { ny, nx };
					que.offer(ichi2);
					visit[ny][nx] = true;
					tesuu[ny][nx] = tesuu[nowy][nowx] + 1;
				}

			}
		}

	}
}
