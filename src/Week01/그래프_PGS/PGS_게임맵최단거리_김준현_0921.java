package Week01.그래프_PGS;

import java.util.*;

public class PGS_게임맵최단거리_김준현_0921 {
	static class Solution {
		public static void main(String[] args) {
			Solution sol = new Solution();
			int[][] maps1 = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
			int[][] maps2 = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,0},{0,0,0,0,1}};
			int result1 = sol.solution(maps1);
			int result2 = sol.solution(maps2);
			System.out.println(result1);
			System.out.println(result2);

		}

		int[] dr = {-1,1,0,0};
		int[] dc = {0,0,-1,1};
		int n,m;
		boolean[][] visited;

		public int solution(int[][] maps) {

			n = maps.length;
			m = maps[0].length;

			visited = new boolean[n][m];
			Queue<int[]> q = new ArrayDeque<>();

			q.offer(new int[]{0,0,1}); // r 좌표, c 좌표, 이동한 거리 세팅
			visited[0][0] = true;

			while(!q.isEmpty()) {
				int[] cur = q.poll();
				int r = cur[0];
				int c = cur[1];
				int dist = cur[2];

				if(r == n - 1 && c == m - 1) { // 목적지인지 먼저 확인
					return dist;
				}

				for(int i = 0; i < 4; i++) {
					int nr = r + dr[i];
					int nc = c + dc[i];

					if(nr < 0 || nr >= n || nc < 0 || nc >= m) continue;
					if(visited[nr][nc] || maps[nr][nc] == 0) continue;

					visited[nr][nc] = true;
					q.offer(new int[]{nr, nc, dist + 1});

				}
			}
			return -1;
		}
	}
}
