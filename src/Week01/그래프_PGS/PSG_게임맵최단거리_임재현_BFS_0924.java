package Week01.그래프_PGS;
import java.util.*;
public class PSG_게임맵최단거리_임재현_BFS_0924 {

	class Solution {

		static int[][] dt = {{-1,0}, {1,0}, {0,-1}, {0,1}};

		public int solution(int[][] maps) {

			int[][] visited = new int[maps.length][maps[0].length];

			int answer = 0;

			Queue<int[]> queue = new ArrayDeque<>();

			queue.offer(new int[]{0, 0, 1});
			visited[0][0] = 1;

			while (!queue.isEmpty()) {

				int[] current = queue.poll();

				int x = current[0];
				int y = current[1];
				int dis = current[2];

				if (x == maps.length-1 && y == maps[0].length-1) {
					answer = dis;
					break;
				}

				for (int[] distance : dt) {

					int nx = x + distance[0];
					int ny = y + distance[1];

					if(!checkIfBlocked(maps, nx, ny, visited)) {
						queue.offer(new int[]{nx, ny, dis+1});
						visited[nx][ny] = 1;
					}

				}

				if (queue.isEmpty()) {
					answer = -1;
					break;
				}

			}

			return answer;
		}

		private boolean checkIfBlocked(int[][] maps, int nx, int ny, int[][] visited) {

			if (nx < 0 || nx > maps.length-1 || ny < 0 || ny > maps[0].length -1 ) {
				return true;
			}

			if (maps[nx][ny] == 0) {
				return true;
			}

			if (visited[nx][ny] == 1) {
				return true;
			}

			return false;
		}

	}

}
