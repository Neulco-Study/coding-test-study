package Week01.그래프_PGS;

public class PGS_방문길이_송시연_0927 {
	static class Solution {
		public int[] dx = {1, -1, 0, 0};
		public int[] dy = {0, 0, 1, -1};

		public int solution(String dirs) {
			boolean[][][] visited = new boolean[11][11][4];
			int answer = 0;

			int x = 5;
			int y = 5;

			char[] moveTo = dirs.toCharArray();

			for (char c : moveTo) {
				int index = move(c);

				int tmpX = x + dx[index];
				int tmpY = y + dy[index];

				if (tmpX < 0 || tmpX >= 11 || tmpY < 0 || tmpY >= 11) {
					continue;
				}

				if (!visited[x][y][index]) {
					answer += 1;
					visited[x][y][index] = true;
					visited[tmpX][tmpY][opposite(index)] = true;
				}

				x = tmpX;
				y = tmpY;
			}

			return answer;
		}

		public int opposite(int direction) {
			if (direction == 0) {
				return 1;
			} else if (direction == 1) {
				return 0;
			} else if (direction == 2) {
				return 3;
			} else if (direction == 3) {
				return 2;
			}
			return -1;
		}

		public int move(char c) {
			if (c == 'U') {
				return 0;
			} else if (c == 'D') {
				return 1;
			} else if (c == 'R') {
				return 2;
			} else if (c == 'L') {
				return 3;
			}

			return -1;
		}
	}
}
