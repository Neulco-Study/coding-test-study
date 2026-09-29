package Week01.그래프_PGS;

import java.util.HashSet;
import java.util.Set;

public class PGS_방의개수_송시연_0929 {
	static class Solution {
		private static final int[] dx = {0, 1, 1, 1, 0, -1, -1, -1};
		private static final int[] dy = {1, 1, 0, -1, -1, -1, 0, 1};

		public int solution(int[] arrows) {
			Set<String> visitedNodes = new HashSet<>();
			Set<String> visitedEdges = new HashSet<>();

			int x = 0;
			int y = 0;
			int roomCount = 0;

			visitedNodes.add(nodeKey(x, y));

			for (int direction : arrows) {
				for (int step = 0; step < 2; step++) {
					int nextX = x + dx[direction];
					int nextY = y + dy[direction];

					String nextNode = nodeKey(nextX, nextY);
					String edge = edgeKey(x, y, direction);

					if (visitedNodes.contains(nextNode) && !visitedEdges.contains(edge)) {
						roomCount++;
					}

					visitedNodes.add(nextNode);
					visitedEdges.add(edge);

					x = nextX;
					y = nextY;
				}
			}

			return roomCount;
		}

		private String nodeKey(int x, int y) {
			return x + "," + y;
		}

		private String edgeKey(int x, int y, int direction) {
			int nextX = x + dx[direction];
			int nextY = y + dy[direction];

			if (x < nextX || (x == nextX && y < nextY)) {
				return x + "," + y + "-" + nextX + "," + nextY;
			}

			return nextX + "," + nextY + "-" + x + "," + y;
		}
	}
}
