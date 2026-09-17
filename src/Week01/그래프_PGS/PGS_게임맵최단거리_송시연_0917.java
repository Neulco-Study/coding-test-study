package Week01.그래프_PGS;

import java.util.ArrayDeque;
import java.util.Queue;

// 9월 17일 목요일
// bfs
// 시작점에서 가까운 칸부터 탐색하고, 목적지에 처음 도착했을 때의 거리를 반환한다.
public class PGS_게임맵최단거리_송시연_0917 {
	static class Solution {
		private static final int[] DX = {-1, 1, 0, 0};
		private static final int[] DY = {0, 0, -1, 1};

		public static void main(String[] args) {
			Solution sol = new Solution();
			int[][] maps1 = {
				{1, 0, 1, 1, 1},
				{1, 0, 1, 0, 1},
				{1, 0, 1, 1, 1},
				{1, 1, 1, 0, 1},
				{0, 0, 0, 0, 1}
			};
			int[][] maps2 = {
				{1, 0, 1, 1, 1},
				{1, 0, 1, 0, 1},
				{1, 0, 1, 1, 1},
				{1, 1, 1, 0, 0},
				{0, 0, 0, 0, 1}
			};

			System.out.println(sol.solution(maps1));
			System.out.println(sol.solution(maps2));
		}

		public int solution(int[][] maps) {
			int rowSize = maps.length;
			int colSize = maps[0].length;
			boolean[][] visited = new boolean[rowSize][colSize];
			Queue<int[]> queue = new ArrayDeque<>();

			queue.offer(new int[]{0, 0, 1});
			visited[0][0] = true;

			while (!queue.isEmpty()) {
				int[] current = queue.poll();
				int x = current[0];
				int y = current[1];
				int distance = current[2];

				if (x == rowSize - 1 && y == colSize - 1) {
					return distance;
				}

				for (int direction = 0; direction < 4; direction++) {
					int nextX = x + DX[direction];
					int nextY = y + DY[direction];

					if (nextX < 0 || nextX >= rowSize || nextY < 0 || nextY >= colSize) {
						continue;
					}
					if (visited[nextX][nextY] || maps[nextX][nextY] == 0) {
						continue;
					}

					visited[nextX][nextY] = true;
					queue.offer(new int[]{nextX, nextY, distance + 1});
				}
			}

			return -1;
		}
	}
}
