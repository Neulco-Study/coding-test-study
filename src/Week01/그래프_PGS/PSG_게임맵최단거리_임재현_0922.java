package Week01.그래프_PGS;

// BFS 로 다시 풀어야함

public class PSG_게임맵최단거리_임재현_0922 {
	class Solution {

		public int solution(int[][] maps) {

			int[][] visited = new int[maps.length][maps[0].length];

			int answer = 0;

			answer = dfs(maps, answer, 0, 0, visited);

			if (answer == 10001) {
				return -1;
			}

			return answer;
		}

		private int dfs(int[][] maps, int answer, int x, int y, int[][] visited) {

			// 보드판 밖이면 바로 리턴
			if (x < 0 || x > maps.length-1 || y < 0 || y > maps[0].length-1 ) {
				return 10001;
			}

			// 방문했으면 리턴
			if (visited[x][y] == 1) {
				return 10001;
			}

			// 벽이면 바로 리턴
			if(maps[x][y] == 0) {
				return 10001;
			}

			visited[x][y] = 1;

			// 목표 도착이면 answer + 1 , 리턴
			if(x == maps.length-1 && y == maps[0].length-1) {
				visited[x][y]=0;
				return answer + 1;
			}

			// 벽 없으면 계속 dfs (상, 하, 좌, 우)
			int up = dfs(maps, answer+1, x-1, y, visited);
			int down = dfs(maps, answer+1, x+1, y, visited);
			int left = dfs(maps, answer+1, x, y-1, visited);
			int right = dfs(maps, answer+1, x, y+1, visited);

			visited[x][y]=0;
			return Math.min( Math.min(up, down), Math.min(left, right));
		}
	}
}
